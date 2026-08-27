import React, { useState, useEffect } from 'react';
import axios from 'axios';

export default function App() {
  const [projects, setProjects] = useState([]);
  const [newProjectName, setNewProjectName] = useState('');

  useEffect(() => { fetchProjects(); }, []);

  const fetchProjects = async () => {
    try {
      const res = await axios.get('http://localhost:8080/api/projects');
      setProjects(res.data);
    } catch (e) { console.error('Error fetching projects'); }
  };

  const createProject = async () => {
    if (!newProjectName) return;
    try {
      await axios.post('http://localhost:8080/api/projects', { name: newProjectName });
      setNewProjectName('');
      fetchProjects();
    } catch (e) { console.error('Error creating project'); }
  };

  return (
    <div className="min-h-screen bg-gray-100 p-8">
      <h1 className="text-3xl font-bold mb-6 text-blue-600">VertexML Engine Platform</h1>
      <div className="bg-white p-6 rounded shadow-md w-full max-w-md">
        <h2 className="text-xl font-semibold mb-4">Projects</h2>
        <div className="flex mb-4">
          <input type="text" className="border p-2 flex-grow rounded-l" value={newProjectName} onChange={(e) => setNewProjectName(e.target.value)} placeholder="New Project Name" />
          <button className="bg-blue-600 text-white px-4 py-2 rounded-r" onClick={createProject}>Create</button>
        </div>
        <ul>
          {projects.map((p: any) => (
            <li key={p.id} className="border-b py-2">{p.name}</li>
          ))}
        </ul>
      </div>
    </div>
  );
}
