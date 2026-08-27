$backend_dir = "backend-core/src/main/java/com/vertexml"
$frontend_dir = "frontend/src"

function Write-File {
    param([string]$Path, [string]$Content)
    $dir = Split-Path $Path
    if (-not (Test-Path $dir)) {
        New-Item -ItemType Directory -Force -Path $dir | Out-Null
    }
    Set-Content -Path $Path -Value $Content
}

Write-Host "Upgrading to Professional Enterprise Dashboard..."

# 1. Expand Backend for Datasets
Write-File "$backend_dir/domain/DatasetRepository.java" "package com.vertexml.domain;`nimport org.springframework.data.jpa.repository.JpaRepository;`nimport java.util.UUID;`npublic interface DatasetRepository extends JpaRepository<Dataset, UUID> {}"
Write-File "$backend_dir/presentation/DatasetController.java" "package com.vertexml.presentation;`nimport com.vertexml.domain.Dataset;`nimport com.vertexml.domain.DatasetRepository;`nimport org.springframework.web.bind.annotation.*;`nimport java.util.List;`nimport java.util.UUID;`n@RestController @RequestMapping(`/`"/api/datasets`/`") @CrossOrigin(origins = `/`"*`/`")`npublic class DatasetController {`n    private final DatasetRepository repo;`n    public DatasetController(DatasetRepository repo) { this.repo = repo; }`n    @GetMapping public List<Dataset> getAll() { return repo.findAll(); }`n    @PostMapping public Dataset create(@RequestBody Dataset d) { return repo.save(d); }`n    @DeleteMapping(`/`"/{id}`/`") public void delete(@PathVariable UUID id) { repo.deleteById(id); }`n}"

# 2. Expand Backend for Models
Write-File "$backend_dir/domain/ModelRepository.java" "package com.vertexml.domain;`nimport org.springframework.data.jpa.repository.JpaRepository;`nimport java.util.UUID;`npublic interface ModelRepository extends JpaRepository<Model, UUID> {}"
Write-File "$backend_dir/presentation/ModelController.java" "package com.vertexml.presentation;`nimport com.vertexml.domain.Model;`nimport com.vertexml.domain.ModelRepository;`nimport org.springframework.web.bind.annotation.*;`nimport java.util.List;`nimport java.util.UUID;`n@RestController @RequestMapping(`/`"/api/models`/`") @CrossOrigin(origins = `/`"*`/`")`npublic class ModelController {`n    private final ModelRepository repo;`n    public ModelController(ModelRepository repo) { this.repo = repo; }`n    @GetMapping public List<Model> getAll() { return repo.findAll(); }`n    @PostMapping public Model create(@RequestBody Model m) { return repo.save(m); }`n    @DeleteMapping(`/`"/{id}`/`") public void delete(@PathVariable UUID id) { repo.deleteById(id); }`n}"

# 3. Professional Frontend App.tsx
Write-File "$frontend_dir/App.tsx" "import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { LayoutDashboard, Database, BrainCircuit, Activity, Plus, Trash2, Search, Bell, Settings, User } from 'lucide-react';

export default function App() {
  const [activeTab, setActiveTab] = useState('projects');
  const [data, setData] = useState<any[]>([]);
  const [newItemName, setNewItemName] = useState('');
  const [loading, setLoading] = useState(false);

  useEffect(() => { fetchData(); }, [activeTab]);

  const fetchData = async () => {
    setLoading(true);
    try {
      const res = await axios.get(` + "`http://localhost:8080/api/${activeTab}`" + `);
      setData(res.data);
    } catch (e) { console.error('Error fetching data'); }
    setLoading(false);
  };

  const handleCreate = async () => {
    if (!newItemName) return;
    try {
      await axios.post(` + "`http://localhost:8080/api/${activeTab}`" + `, { name: newItemName });
      setNewItemName('');
      fetchData();
    } catch (e) { console.error('Error creating item'); }
  };

  const handleDelete = async (id: string) => {
    try {
      await axios.delete(` + "`http://localhost:8080/api/${activeTab}/${id}`" + `);
      fetchData();
    } catch (e) { console.error('Error deleting item'); }
  };

  const getTitle = () => {
    if(activeTab === 'projects') return 'Active Projects';
    if(activeTab === 'datasets') return 'Dataset Registry';
    if(activeTab === 'models') return 'Model Zoo';
    return 'Dashboard';
  }

  return (
    <div className=`"flex h-screen bg-slate-50 font-sans text-slate-800`">
      {/* Sidebar */}
      <div className=`"w-72 bg-[#0f172a] text-slate-300 flex flex-col shadow-xl z-10`">
        <div className=`"h-20 flex items-center px-6 border-b border-slate-800 bg-[#0b1120]`">
          <div className=`"w-10 h-10 bg-indigo-600 rounded-xl flex items-center justify-center font-bold text-white text-xl mr-4 shadow-lg shadow-indigo-500/30`">
            <BrainCircuit size={24} />
          </div>
          <span className=`"text-2xl font-bold tracking-tight text-white`">VertexML</span>
        </div>
        
        <div className=`"flex-1 py-6 px-4 space-y-2 overflow-y-auto`">
          <div className=`"text-xs font-semibold text-slate-500 uppercase tracking-wider mb-4 px-3`">Platform</div>
          
          <button onClick={() => setActiveTab('projects')} className={` + "`w-full flex items-center space-x-3 px-4 py-3 rounded-xl transition-all duration-200 ${activeTab === 'projects' ? 'bg-indigo-600 text-white shadow-md' : 'hover:bg-slate-800 hover:text-white'}`" + `}>
            <LayoutDashboard size={20} className={activeTab === 'projects' ? 'text-indigo-200' : 'text-slate-400'} />
            <span className=`"font-medium`">Projects</span>
          </button>
          
          <button onClick={() => setActiveTab('datasets')} className={` + "`w-full flex items-center space-x-3 px-4 py-3 rounded-xl transition-all duration-200 ${activeTab === 'datasets' ? 'bg-indigo-600 text-white shadow-md' : 'hover:bg-slate-800 hover:text-white'}`" + `}>
            <Database size={20} className={activeTab === 'datasets' ? 'text-indigo-200' : 'text-slate-400'} />
            <span className=`"font-medium`">Datasets</span>
          </button>
          
          <button onClick={() => setActiveTab('models')} className={` + "`w-full flex items-center space-x-3 px-4 py-3 rounded-xl transition-all duration-200 ${activeTab === 'models' ? 'bg-indigo-600 text-white shadow-md' : 'hover:bg-slate-800 hover:text-white'}`" + `}>
            <BrainCircuit size={20} className={activeTab === 'models' ? 'text-indigo-200' : 'text-slate-400'} />
            <span className=`"font-medium`">Models</span>
          </button>
        </div>
        
        <div className=`"p-4 border-t border-slate-800`">
          <button className=`"w-full flex items-center space-x-3 px-4 py-3 hover:bg-slate-800 rounded-xl transition-colors`">
            <Settings size={20} className=`"text-slate-400`" />
            <span className=`"font-medium`">Settings</span>
          </button>
        </div>
      </div>

      {/* Main Content */}
      <div className=`"flex-1 flex flex-col overflow-hidden bg-slate-50/50`">
        {/* Header */}
        <header className=`"h-20 bg-white border-b border-slate-200 flex items-center justify-between px-10 shadow-sm z-0`">
          <div className=`"flex items-center bg-slate-100 px-4 py-2 rounded-lg w-96 border border-slate-200 focus-within:border-indigo-500 focus-within:ring-1 focus-within:ring-indigo-500 transition-all`">
            <Search size={18} className=`"text-slate-400 mr-3`" />
            <input type=`"text`" placeholder=`"Search everything...`" className=`"bg-transparent border-none outline-none w-full text-sm placeholder-slate-400 text-slate-700`" />
          </div>
          <div className=`"flex items-center space-x-6`">
            <button className=`"relative text-slate-400 hover:text-slate-600 transition-colors`">
              <Bell size={22} />
              <span className=`"absolute -top-1 -right-1 w-2.5 h-2.5 bg-red-500 rounded-full border-2 border-white`"></span>
            </button>
            <div className=`"h-8 w-px bg-slate-200`"></div>
            <div className=`"flex items-center space-x-3 cursor-pointer hover:bg-slate-50 p-2 rounded-lg transition-colors`">
              <div className=`"w-10 h-10 bg-gradient-to-tr from-indigo-500 to-purple-500 rounded-full flex items-center justify-center text-white shadow-sm`">
                <User size={20} />
              </div>
              <div className=`"flex flex-col`">
                <span className=`"text-sm font-bold text-slate-700`">Venkatesh Naik</span>
                <span className=`"text-xs font-medium text-slate-500`">Enterprise Admin</span>
              </div>
            </div>
          </div>
        </header>

        {/* Dashboard Body */}
        <main className=`"flex-1 overflow-auto p-10`">
          <div className=`"max-w-7xl mx-auto space-y-8`">
            
            {/* Stats Row */}
            <div className=`"grid grid-cols-3 gap-6`">
              <div className=`"bg-white p-6 rounded-2xl shadow-sm border border-slate-200 flex items-center justify-between hover:shadow-md transition-shadow`">
                <div>
                  <p className=`"text-sm font-semibold text-slate-500 uppercase tracking-wide`">Total Projects</p>
                  <p className=`"text-3xl font-bold text-slate-800 mt-1`">{activeTab === 'projects' ? data.length : 12}</p>
                </div>
                <div className=`"w-12 h-12 bg-indigo-50 text-indigo-600 rounded-xl flex items-center justify-center`">
                  <LayoutDashboard size={24} />
                </div>
              </div>
              <div className=`"bg-white p-6 rounded-2xl shadow-sm border border-slate-200 flex items-center justify-between hover:shadow-md transition-shadow`">
                <div>
                  <p className=`"text-sm font-semibold text-slate-500 uppercase tracking-wide`">Active Datasets</p>
                  <p className=`"text-3xl font-bold text-slate-800 mt-1`">{activeTab === 'datasets' ? data.length : 84}</p>
                </div>
                <div className=`"w-12 h-12 bg-emerald-50 text-emerald-600 rounded-xl flex items-center justify-center`">
                  <Database size={24} />
                </div>
              </div>
              <div className=`"bg-white p-6 rounded-2xl shadow-sm border border-slate-200 flex items-center justify-between hover:shadow-md transition-shadow`">
                <div>
                  <p className=`"text-sm font-semibold text-slate-500 uppercase tracking-wide`">Deployed Models</p>
                  <p className=`"text-3xl font-bold text-slate-800 mt-1`">{activeTab === 'models' ? data.length : 7}</p>
                </div>
                <div className=`"w-12 h-12 bg-purple-50 text-purple-600 rounded-xl flex items-center justify-center`">
                  <Activity size={24} />
                </div>
              </div>
            </div>

            {/* Data Table Section */}
            <div className=`"bg-white rounded-2xl shadow-sm border border-slate-200 overflow-hidden`">
              <div className=`"p-6 border-b border-slate-200 flex justify-between items-center bg-white`">
                <h2 className=`"text-xl font-bold text-slate-800`">{getTitle()}</h2>
                <div className=`"flex space-x-3`">
                  <input 
                    type=`"text`" 
                    value={newItemName} 
                    onChange={(e) => setNewItemName(e.target.value)} 
                    placeholder={` + "`New ${activeTab.slice(0,-1)} name...`" + `} 
                    className=`"px-4 py-2.5 border border-slate-200 rounded-xl focus:outline-none focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 shadow-sm text-sm w-64`"
                  />
                  <button 
                    onClick={handleCreate}
                    disabled={!newItemName}
                    className=`"bg-indigo-600 hover:bg-indigo-700 disabled:bg-indigo-300 text-white px-5 py-2.5 rounded-xl font-medium shadow-sm transition-colors flex items-center text-sm`">
                    <Plus size={18} className=`"mr-2`" />
                    Create
                  </button>
                </div>
              </div>
              
              <div className=`"overflow-x-auto`">
                <table className=`"w-full text-left border-collapse`">
                  <thead className=`"bg-slate-50/50`">
                    <tr>
                      <th className=`"px-8 py-5 font-semibold text-xs text-slate-500 uppercase tracking-wider border-b border-slate-200`">Name</th>
                      <th className=`"px-8 py-5 font-semibold text-xs text-slate-500 uppercase tracking-wider border-b border-slate-200`">Status</th>
                      <th className=`"px-8 py-5 font-semibold text-xs text-slate-500 uppercase tracking-wider border-b border-slate-200`">UUID</th>
                      <th className=`"px-8 py-5 font-semibold text-xs text-slate-500 uppercase tracking-wider border-b border-slate-200 text-right`">Actions</th>
                    </tr>
                  </thead>
                  <tbody className=`"divide-y divide-slate-100 bg-white`">
                    {loading ? (
                      <tr>
                        <td colSpan={4} className=`"px-8 py-12 text-center`">
                          <div className=`"inline-block h-8 w-8 animate-spin rounded-full border-4 border-solid border-indigo-600 border-r-transparent align-[-0.125em] motion-reduce:animate-[spin_1.5s_linear_infinite]`"></div>
                          <p className=`"mt-4 text-slate-500 font-medium`">Loading data...</p>
                        </td>
                      </tr>
                    ) : data.length === 0 ? (
                      <tr>
                        <td colSpan={4} className=`"px-8 py-16 text-center`">
                          <div className=`"mx-auto w-16 h-16 bg-slate-100 rounded-full flex items-center justify-center mb-4`">
                            <Database className=`"text-slate-400`" size={24} />
                          </div>
                          <h3 className=`"text-lg font-semibold text-slate-800 mb-1`">No {activeTab} found</h3>
                          <p className=`"text-slate-500 max-w-sm mx-auto`">Get started by creating your first {activeTab.slice(0,-1)} using the input field above.</p>
                        </td>
                      </tr>
                    ) : data.map((item: any) => (
                      <tr key={item.id} className=`"hover:bg-slate-50/80 transition-colors group`">
                        <td className=`"px-8 py-5 whitespace-nowrap font-semibold text-slate-700`">{item.name}</td>
                        <td className=`"px-8 py-5 whitespace-nowrap`">
                          <span className=`"px-3 py-1 bg-emerald-100/80 text-emerald-700 text-xs font-bold rounded-full border border-emerald-200`">Active</span>
                        </td>
                        <td className=`"px-8 py-5 whitespace-nowrap text-sm text-slate-400 font-mono`">{item.id}</td>
                        <td className=`"px-8 py-5 whitespace-nowrap text-right`">
                          <button onClick={() => handleDelete(item.id)} className=`"p-2 text-slate-400 hover:text-red-600 hover:bg-red-50 rounded-lg transition-colors opacity-0 group-hover:opacity-100`">
                            <Trash2 size={18} />
                          </button>
                        </td>
                      </tr>
                    ))}
                  </tbody>
                </table>
              </div>
            </div>
          </div>
        </main>
      </div>
    </div>
  );
}"

Write-Host "Done writing professional frontend."
