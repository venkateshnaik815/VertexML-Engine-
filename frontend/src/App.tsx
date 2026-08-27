import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { LayoutDashboard, Edit2, Database, BrainCircuit, Activity, Plus, Trash2, Search, Bell, Settings, User, X, LogOut, CheckCircle2, Lock, Mail, ArrowRight } from 'lucide-react';

export default function App() {
  const [isAuthenticated, setIsAuthenticated] = useState(true);
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [loginError, setLoginError] = useState(false);

  const [activeTab, setActiveTab] = useState('projects');
  const [data, setData] = useState<any[]>([]);
  const [stats, setStats] = useState({ projects: 0, datasets: 0, models: 0, endpoints: 0 });
  const [newItemName, setNewItemName] = useState('');
  const [loading, setLoading] = useState(false);
  const [searchQuery, setSearchQuery] = useState('');
  const [showSettings, setShowSettings] = useState(false);
  const [showProfile, setShowProfile] = useState(false);
  const [showNotifs, setShowNotifs] = useState(false);
  
  // Settings State
  const [themePref, setThemePref] = useState('System Default');
  const [workspacePref, setWorkspacePref] = useState('Default Workspace');
  const [expFeatures, setExpFeatures] = useState(true);

  useEffect(() => { 
    if (isAuthenticated) {
      fetchData(); 
      fetchStats();
    }
  }, [activeTab, isAuthenticated]);

  const handleLogin = (e: React.FormEvent) => {
    e.preventDefault();
    if (email && password) {
      setIsAuthenticated(true);
      setLoginError(false);
    } else {
      setLoginError(true);
    }
  };

  const fetchData = async () => {
    setLoading(true);
    try {
      const res = await axios.get(`http://localhost:8080/api/${activeTab}`);
      setData(res.data);
    } catch (e) { console.error('Error fetching data'); }
    setLoading(false);
  };

  const fetchStats = async () => {
    try {
      const res = await axios.get('http://localhost:8080/api/stats');
      setStats(res.data);
    } catch (e) { console.error('Error fetching stats'); }
  };

  const handleCreate = async () => {
    if (!newItemName) return;
    try {
      await axios.post(`http://localhost:8080/api/${activeTab}`, { name: newItemName });
      setNewItemName('');
      fetchData();
      fetchStats();
    } catch (e) { console.error('Error creating item'); }
  };

  const handleDelete = async (id: string) => {
    try {
      await axios.delete(`http://localhost:8080/api/${activeTab}/${id}`);
      fetchData();
      fetchStats();
    } catch (e) { console.error('Error deleting item'); }
  };

  const getTitle = () => {
    if(activeTab === 'projects') return 'Active Projects';
    if(activeTab === 'datasets') return 'Dataset Registry';
    if(activeTab === 'models') return 'Model Zoo';
    if(activeTab === 'endpoints') return 'Deployed Endpoints';
    return 'Dashboard';
  }

  const filteredData = data.filter(d => d.name && d.name.toLowerCase().includes(searchQuery.toLowerCase()));

  // -------------------------------------------------------------------------
  // LOGIN SCREEN
  // -------------------------------------------------------------------------
  if (!isAuthenticated) {
    return (
      <div className="min-h-screen flex bg-white font-sans text-slate-800">
        {/* Left Side - Brand & Gradient */}
        <div className="hidden lg:flex lg:w-1/2 bg-slate-900 relative overflow-hidden items-center justify-center">
          {/* Decorative Background Elements */}
          <div className="absolute top-0 left-0 w-full h-full bg-gradient-to-br from-indigo-600/20 to-purple-800/40 z-0"></div>
          <div className="absolute -top-[20%] -left-[10%] w-[70%] h-[70%] rounded-full bg-indigo-500/20 blur-[120px]"></div>
          <div className="absolute bottom-[10%] -right-[10%] w-[60%] h-[60%] rounded-full bg-purple-500/20 blur-[100px]"></div>
          
          <div className="relative z-10 p-16 max-w-2xl text-center">
            <div className="w-20 h-20 bg-indigo-600 rounded-2xl flex items-center justify-center font-bold text-white shadow-2xl mx-auto mb-8 shadow-indigo-500/50">
              <BrainCircuit size={48} />
            </div>
            <h1 className="text-4xl font-extrabold text-white tracking-tight mb-6 leading-tight">
              Enterprise Machine Learning <br/> Platform
            </h1>
            <p className="text-lg text-slate-300 leading-relaxed max-w-lg mx-auto">
              Build, train, and deploy models at scale. Secure your ML workflows with enterprise-grade infrastructure.
            </p>
          </div>
        </div>

        {/* Right Side - Login Form */}
        <div className="w-full lg:w-1/2 flex items-center justify-center p-8 sm:p-12 lg:p-24 bg-slate-50 relative">
          <div className="w-full max-w-md bg-white p-10 rounded-3xl shadow-xl border border-slate-100">
            <div className="text-center mb-10">
              <h2 className="text-3xl font-bold text-slate-900 tracking-tight">Welcome back</h2>
              <p className="text-slate-500 mt-3 text-sm">Please enter your enterprise credentials to access your workspaces.</p>
            </div>
            
            <form onSubmit={handleLogin} className="space-y-6">
              {loginError && (
                <div className="p-4 bg-red-50 border border-red-100 rounded-xl flex items-start">
                  <p className="text-sm text-red-600 font-medium">Please enter a valid email and password to continue.</p>
                </div>
              )}
              
              <div>
                <label className="block text-sm font-semibold text-slate-700 mb-2">Work Email</label>
                <div className="relative">
                  <div className="absolute inset-y-0 left-0 pl-4 flex items-center pointer-events-none">
                    <Mail size={18} className="text-slate-400" />
                  </div>
                  <input 
                    type="email" 
                    value={email}
                    onChange={(e) => setEmail(e.target.value)}
                    className="block w-full pl-11 pr-4 py-3 bg-slate-50 border border-slate-200 rounded-xl text-sm focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 transition-all outline-none" 
                    placeholder="name@company.com"
                  />
                </div>
              </div>

              <div>
                <div className="flex justify-between items-center mb-2">
                  <label className="block text-sm font-semibold text-slate-700">Password</label>
                </div>
                <div className="relative">
                  <div className="absolute inset-y-0 left-0 pl-4 flex items-center pointer-events-none">
                    <Lock size={18} className="text-slate-400" />
                  </div>
                  <input 
                    type="password" 
                    value={password}
                    onChange={(e) => setPassword(e.target.value)}
                    className="block w-full pl-11 pr-4 py-3 bg-slate-50 border border-slate-200 rounded-xl text-sm focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 transition-all outline-none" 
                    placeholder="••••••••"
                  />
                </div>
              </div>

              <div className="flex items-center">
                <input id="remember-me" type="checkbox" className="h-4 w-4 text-indigo-600 focus:ring-indigo-500 border-gray-300 rounded cursor-pointer" />
                <label htmlFor="remember-me" className="ml-2 block text-sm text-slate-600 cursor-pointer">
                  Remember my device for 30 days
                </label>
              </div>

              <button 
                type="submit" 
                className="w-full flex justify-center items-center py-3.5 px-4 border border-transparent rounded-xl shadow-sm text-sm font-bold text-white bg-indigo-600 hover:bg-indigo-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-indigo-500 transition-colors"
              >
                Sign in to VertexML
                <ArrowRight size={18} className="ml-2" />
              </button>
            </form>
            
          </div>
        </div>
      </div>
    );
  }

  // -------------------------------------------------------------------------
  // MAIN DASHBOARD (Only shown if isAuthenticated === true)
  // -------------------------------------------------------------------------
  return (
    <div className={`flex h-screen bg-slate-50 font-sans text-slate-800 ${themePref === 'Dark Mode' ? 'invert hue-rotate-180' : ''}`}>
      
      {/* Settings Modal */}
      {showSettings && (
        <div className="fixed inset-0 bg-slate-900/50 z-50 flex items-center justify-center">
          <div className="bg-white rounded-2xl w-full max-w-2xl overflow-hidden shadow-2xl">
            <div className="p-6 border-b border-slate-200 flex justify-between items-center">
              <h2 className="text-xl font-bold">Platform Settings</h2>
              <button onClick={() => setShowSettings(false)} className="text-slate-400 hover:text-slate-600"><X /></button>
            </div>
            <div className="p-6 space-y-6">
              <div>
                <label className="block text-sm font-medium text-slate-700 mb-2">Theme Preference</label>
                <select value={themePref} onChange={e => setThemePref(e.target.value)} className="w-full border-slate-300 rounded-lg shadow-sm p-2.5 border">
                  <option>System Default</option>
                  <option>Light Mode</option>
                  <option>Dark Mode</option>
                </select>
              </div>
              <div>
                <label className="block text-sm font-medium text-slate-700 mb-2">Default Workspace</label>
                <select value={workspacePref} onChange={e => setWorkspacePref(e.target.value)} className="w-full border-slate-300 rounded-lg shadow-sm p-2.5 border">
                  <option>Default Workspace</option>
                  <option>Team Alpha</option>
                  <option>Production ML</option>
                </select>
              </div>
              <div className="flex items-center">
                <input type="checkbox" checked={expFeatures} onChange={e => setExpFeatures(e.target.checked)} className="h-4 w-4 text-indigo-600 focus:ring-indigo-500 border-gray-300 rounded" />
                <label className="ml-2 block text-sm text-gray-900">Enable Experimental Features</label>
              </div>
            </div>
            <div className="p-6 border-t border-slate-200 bg-slate-50 flex justify-end space-x-3">
              <button onClick={() => setShowSettings(false)} className="px-5 py-2 border border-slate-300 rounded-lg font-medium text-slate-700 hover:bg-slate-100">Cancel</button>
              <button onClick={() => setShowSettings(false)} className="px-5 py-2 bg-indigo-600 text-white rounded-lg font-medium hover:bg-indigo-700">Save Changes</button>
            </div>
          </div>
        </div>
      )}

      {/* Sidebar */}
      <div className="w-72 bg-[#0f172a] text-slate-300 flex flex-col shadow-xl z-10 relative">
        <div className="h-20 flex items-center px-6 border-b border-slate-800 bg-[#0b1120]">
          <div className="w-10 h-10 bg-indigo-600 rounded-xl flex items-center justify-center font-bold text-white text-xl mr-4 shadow-lg shadow-indigo-500/30">
            <BrainCircuit size={24} />
          </div>
          <span className="text-2xl font-bold tracking-tight text-white">VertexML</span>
        </div>
        
        <div className="flex-1 py-6 px-4 space-y-2 overflow-y-auto">
          <div className="text-xs font-semibold text-slate-500 uppercase tracking-wider mb-4 px-3">Platform</div>
          
          <button onClick={() => setActiveTab('projects')} className={`w-full flex items-center space-x-3 px-4 py-3 rounded-xl transition-all duration-200 ${activeTab === 'projects' ? 'bg-indigo-600 text-white shadow-md' : 'hover:bg-slate-800 hover:text-white'}`}>
            <LayoutDashboard size={20} className={activeTab === 'projects' ? 'text-indigo-200' : 'text-slate-400'} />
            <span className="font-medium">Projects</span>
          </button>
          
          <button onClick={() => setActiveTab('datasets')} className={`w-full flex items-center space-x-3 px-4 py-3 rounded-xl transition-all duration-200 ${activeTab === 'datasets' ? 'bg-indigo-600 text-white shadow-md' : 'hover:bg-slate-800 hover:text-white'}`}>
            <Database size={20} className={activeTab === 'datasets' ? 'text-indigo-200' : 'text-slate-400'} />
            <span className="font-medium">Datasets</span>
          </button>
          
          <button onClick={() => setActiveTab('models')} className={`w-full flex items-center space-x-3 px-4 py-3 rounded-xl transition-all duration-200 ${activeTab === 'models' ? 'bg-indigo-600 text-white shadow-md' : 'hover:bg-slate-800 hover:text-white'}`}>
            <BrainCircuit size={20} className={activeTab === 'models' ? 'text-indigo-200' : 'text-slate-400'} />
            <span className="font-medium">Models</span>
          </button>

          <button onClick={() => setActiveTab('endpoints')} className={`w-full flex items-center space-x-3 px-4 py-3 rounded-xl transition-all duration-200 ${activeTab === 'endpoints' ? 'bg-indigo-600 text-white shadow-md' : 'hover:bg-slate-800 hover:text-white'}`}>
            <Activity size={20} className={activeTab === 'endpoints' ? 'text-indigo-200' : 'text-slate-400'} />
            <span className="font-medium">Endpoints</span>
          </button>
        </div>
        
        <div className="p-4 border-t border-slate-800">
          <button onClick={() => setShowSettings(true)} className="w-full flex items-center space-x-3 px-4 py-3 hover:bg-slate-800 rounded-xl transition-colors">
            <Settings size={20} className="text-slate-400" />
            <span className="font-medium">Settings</span>
          </button>
        </div>
      </div>

      {/* Main Content */}
      <div className="flex-1 flex flex-col overflow-hidden bg-slate-50/50">
        {/* Header */}
        <header className="h-20 bg-white border-b border-slate-200 flex items-center justify-between px-10 shadow-sm z-0 relative">
          <div className="flex items-center bg-slate-100 px-4 py-2 rounded-lg w-96 border border-slate-200 focus-within:border-indigo-500 focus-within:ring-1 focus-within:ring-indigo-500 transition-all">
            <Search size={18} className="text-slate-400 mr-3" />
            <input type="text" value={searchQuery} onChange={e => setSearchQuery(e.target.value)} placeholder={`Search ${activeTab}...`} className="bg-transparent border-none outline-none w-full text-sm placeholder-slate-400 text-slate-700" />
          </div>
          <div className="flex items-center space-x-6 relative">
            <button onClick={() => {setShowNotifs(!showNotifs); setShowProfile(false);}} className="relative text-slate-400 hover:text-slate-600 transition-colors">
              <Bell size={22} />
              <span className="absolute -top-1 -right-1 w-2.5 h-2.5 bg-red-500 rounded-full border-2 border-white"></span>
            </button>
            
            {/* Notifs Dropdown */}
            {showNotifs && (
              <div className="absolute top-12 right-48 w-80 bg-white border border-slate-200 shadow-xl rounded-xl overflow-hidden z-20">
                <div className="p-4 border-b border-slate-100 bg-slate-50 font-semibold">Notifications</div>
                <div className="p-4 flex items-start space-x-3 hover:bg-slate-50 border-b border-slate-100 cursor-pointer">
                  <CheckCircle2 className="text-emerald-500 mt-0.5" size={18} />
                  <div>
                    <p className="text-sm font-medium">Model Training Complete</p>
                    <p className="text-xs text-slate-500 mt-1">ResNet-50 v2 finished in 45m</p>
                  </div>
                </div>
                <div className="p-4 flex items-start space-x-3 hover:bg-slate-50 cursor-pointer">
                  <Activity className="text-blue-500 mt-0.5" size={18} />
                  <div>
                    <p className="text-sm font-medium">New Endpoint Deployed</p>
                    <p className="text-xs text-slate-500 mt-1">prod-inference-v1 is live</p>
                  </div>
                </div>
              </div>
            )}

            <div className="h-8 w-px bg-slate-200"></div>
            
            <div onClick={() => {setShowProfile(!showProfile); setShowNotifs(false);}} className="flex items-center space-x-3 cursor-pointer hover:bg-slate-50 p-2 rounded-lg transition-colors relative">
              <div className="w-10 h-10 bg-gradient-to-tr from-indigo-500 to-purple-500 rounded-full flex items-center justify-center text-white shadow-sm">
                <User size={20} />
              </div>
              <div className="flex flex-col">
                <span className="text-sm font-bold text-slate-700">Venkatesh Naik</span>
                <span className="text-xs font-medium text-slate-500">Enterprise Admin</span>
              </div>
            </div>

            {/* Profile Dropdown */}
            {showProfile && (
              <div className="absolute top-14 right-0 w-56 bg-white border border-slate-200 shadow-xl rounded-xl py-2 z-20">
                <div className="px-4 py-2 border-b border-slate-100 mb-2">
                  <p className="font-semibold text-slate-700">{email || "admin@vertexml.com"}</p>
                </div>
                <button onClick={() => setShowSettings(true)} className="w-full text-left px-4 py-2 text-sm text-slate-700 hover:bg-slate-50 flex items-center"><Settings size={16} className="mr-3 text-slate-400" /> Account Settings</button>
                <button onClick={() => setIsAuthenticated(false)} className="w-full text-left px-4 py-2 text-sm text-red-600 hover:bg-red-50 flex items-center"><LogOut size={16} className="mr-3 text-red-400" /> Sign out</button>
              </div>
            )}
          </div>
        </header>

        {/* Dashboard Body */}
        <main className="flex-1 overflow-auto p-10" onClick={() => {setShowProfile(false); setShowNotifs(false);}}>
          <div className="max-w-7xl mx-auto space-y-8">
            
            {/* Stats Row */}
            <div className="grid grid-cols-4 gap-6">
              <div className={`bg-white p-6 rounded-2xl shadow-sm border ${activeTab === 'projects' ? 'border-indigo-500 ring-1 ring-indigo-500' : 'border-slate-200'} flex items-center justify-between hover:shadow-md transition-shadow cursor-pointer`} onClick={() => setActiveTab('projects')}>
                <div>
                  <p className="text-sm font-semibold text-slate-500 uppercase tracking-wide">Total Projects</p>
                  <p className="text-3xl font-bold text-slate-800 mt-1">{stats.projects}</p>
                </div>
                <div className="w-12 h-12 bg-indigo-50 text-indigo-600 rounded-xl flex items-center justify-center">
                  <LayoutDashboard size={24} />
                </div>
              </div>
              <div className={`bg-white p-6 rounded-2xl shadow-sm border ${activeTab === 'datasets' ? 'border-emerald-500 ring-1 ring-emerald-500' : 'border-slate-200'} flex items-center justify-between hover:shadow-md transition-shadow cursor-pointer`} onClick={() => setActiveTab('datasets')}>
                <div>
                  <p className="text-sm font-semibold text-slate-500 uppercase tracking-wide">Datasets</p>
                  <p className="text-3xl font-bold text-slate-800 mt-1">{stats.datasets}</p>
                </div>
                <div className="w-12 h-12 bg-emerald-50 text-emerald-600 rounded-xl flex items-center justify-center">
                  <Database size={24} />
                </div>
              </div>
              <div className={`bg-white p-6 rounded-2xl shadow-sm border ${activeTab === 'models' ? 'border-purple-500 ring-1 ring-purple-500' : 'border-slate-200'} flex items-center justify-between hover:shadow-md transition-shadow cursor-pointer`} onClick={() => setActiveTab('models')}>
                <div>
                  <p className="text-sm font-semibold text-slate-500 uppercase tracking-wide">Model Zoo</p>
                  <p className="text-3xl font-bold text-slate-800 mt-1">{stats.models}</p>
                </div>
                <div className="w-12 h-12 bg-purple-50 text-purple-600 rounded-xl flex items-center justify-center">
                  <BrainCircuit size={24} />
                </div>
              </div>
              <div className={`bg-white p-6 rounded-2xl shadow-sm border ${activeTab === 'endpoints' ? 'border-blue-500 ring-1 ring-blue-500' : 'border-slate-200'} flex items-center justify-between hover:shadow-md transition-shadow cursor-pointer`} onClick={() => setActiveTab('endpoints')}>
                <div>
                  <p className="text-sm font-semibold text-slate-500 uppercase tracking-wide">Endpoints</p>
                  <p className="text-3xl font-bold text-slate-800 mt-1">{stats.endpoints}</p>
                </div>
                <div className="w-12 h-12 bg-blue-50 text-blue-600 rounded-xl flex items-center justify-center">
                  <Activity size={24} />
                </div>
              </div>
            </div>

            {/* Data Table Section */}
            <div className="bg-white rounded-2xl shadow-sm border border-slate-200 overflow-hidden">
              <div className="p-6 border-b border-slate-200 flex justify-between items-center bg-white">
                <h2 className="text-xl font-bold text-slate-800">{getTitle()}</h2>
                <div className="flex space-x-3">
                  <input 
                    type="text" 
                    value={newItemName} 
                    onChange={(e) => setNewItemName(e.target.value)} 
                    placeholder={`New ${activeTab.slice(0,-1)} name...`} 
                    className="px-4 py-2.5 border border-slate-200 rounded-xl focus:outline-none focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500 shadow-sm text-sm w-64"
                    onKeyDown={e => e.key === 'Enter' && handleCreate()}
                  />
                  <button 
                    onClick={handleCreate}
                    disabled={!newItemName}
                    className="bg-indigo-600 hover:bg-indigo-700 disabled:bg-indigo-300 text-white px-5 py-2.5 rounded-xl font-medium shadow-sm transition-colors flex items-center text-sm">
                    <Plus size={18} className="mr-2" />
                    Create
                  </button>
                </div>
              </div>
              
              <div className="overflow-x-auto">
                <table className="w-full text-left border-collapse">
                  <thead className="bg-slate-50/50">
                    <tr>
                      <th className="px-8 py-5 font-semibold text-xs text-slate-500 uppercase tracking-wider border-b border-slate-200">Name</th>
                      <th className="px-8 py-5 font-semibold text-xs text-slate-500 uppercase tracking-wider border-b border-slate-200">Status</th>
                      <th className="px-8 py-5 font-semibold text-xs text-slate-500 uppercase tracking-wider border-b border-slate-200">UUID</th>
                      <th className="px-8 py-5 font-semibold text-xs text-slate-500 uppercase tracking-wider border-b border-slate-200 text-right">Actions</th>
                    </tr>
                  </thead>
                  <tbody className="divide-y divide-slate-100 bg-white">
                    {loading ? (
                      <tr>
                        <td colSpan={4} className="px-8 py-12 text-center">
                          <div className="inline-block h-8 w-8 animate-spin rounded-full border-4 border-solid border-indigo-600 border-r-transparent align-[-0.125em] motion-reduce:animate-[spin_1.5s_linear_infinite]"></div>
                          <p className="mt-4 text-slate-500 font-medium">Loading data...</p>
                        </td>
                      </tr>
                    ) : filteredData.length === 0 ? (
                      <tr>
                        <td colSpan={4} className="px-8 py-16 text-center">
                          <div className="mx-auto w-16 h-16 bg-slate-100 rounded-full flex items-center justify-center mb-4">
                            <Database className="text-slate-400" size={24} />
                          </div>
                          <h3 className="text-lg font-semibold text-slate-800 mb-1">
                            {searchQuery ? 'No results found' : `No ${activeTab} found`}
                          </h3>
                          <p className="text-slate-500 max-w-sm mx-auto">
                            {searchQuery ? `No matching items for "${searchQuery}"` : `Get started by creating your first ${activeTab.slice(0,-1)} using the input field above.`}
                          </p>
                        </td>
                      </tr>
                    ) : filteredData.map((item: any) => (
                                            <tr key={item.id} className="hover:bg-slate-50/80 transition-colors group">
                        <td className="px-8 py-5 whitespace-nowrap font-bold text-slate-700">{item.name}</td>
                        <td className="px-8 py-5 whitespace-nowrap">
                          {activeTab === "endpoints" && item.name.includes("stage") ? (
                            <span className="px-3 py-1 bg-amber-100/80 text-amber-700 text-xs font-bold rounded-full border border-amber-200 flex items-center w-max shadow-sm">
                              <span className="w-1.5 h-1.5 bg-amber-500 rounded-full mr-1.5 animate-pulse"></span> Staging
                            </span>
                          ) : activeTab === "models" && item.name.includes("V2") ? (
                            <span className="px-3 py-1 bg-purple-100/80 text-purple-700 text-xs font-bold rounded-full border border-purple-200 flex items-center w-max shadow-sm">
                              <span className="w-1.5 h-1.5 bg-purple-500 rounded-full mr-1.5 animate-pulse"></span> Training
                            </span>
                          ) : activeTab === "datasets" && item.name.includes("Dump") ? (
                            <span className="px-3 py-1 bg-blue-100/80 text-blue-700 text-xs font-bold rounded-full border border-blue-200 flex items-center w-max shadow-sm">
                              <span className="w-1.5 h-1.5 bg-blue-500 rounded-full mr-1.5"></span> Syncing
                            </span>
                          ) : (
                            <span className="px-3 py-1 bg-emerald-100/80 text-emerald-700 text-xs font-bold rounded-full border border-emerald-200 flex items-center w-max shadow-sm">
                              <span className="w-1.5 h-1.5 bg-emerald-500 rounded-full mr-1.5"></span> Active
                            </span>
                          )}
                        </td>
                        <td className="px-8 py-5 whitespace-nowrap text-sm text-slate-400 font-mono">{item.id}</td>
                        <td className="px-8 py-5 whitespace-nowrap text-right space-x-2">
                          <button className="p-2 text-slate-400 hover:text-indigo-600 hover:bg-indigo-50 rounded-lg transition-colors opacity-0 group-hover:opacity-100" title="Edit Item">
                            <Edit2 size={18} />
                          </button>
                          <button onClick={() => handleDelete(item.id)} className="p-2 text-slate-400 hover:text-red-600 hover:bg-red-50 rounded-lg transition-colors opacity-0 group-hover:opacity-100" title="Delete Item">
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
}

