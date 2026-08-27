$backend_dir = "backend-core/src/main/java/com/vertexml"
$frontend_dir = "frontend/src"

function Write-File {
    param([string]$Path, [string]$Content)
    Set-Content -Path $Path -Value $Content
}

# 1. Update Backend to use H2 In-Memory Database (No Docker Required)
Write-Host "Configuring Backend for H2..."
$pomPath = "backend-core/pom.xml"
$pomContent = Get-Content $pomPath -Raw
if ($pomContent -notmatch "h2database") {
    $pomContent = $pomContent -replace "</dependencies>", "  <dependency>`n      <groupId>com.h2database</groupId>`n      <artifactId>h2</artifactId>`n      <scope>runtime</scope>`n    </dependency>`n  </dependencies>"
    Set-Content $pomPath $pomContent
}

Write-File "backend-core/src/main/resources/application.properties" "spring.datasource.url=jdbc:h2:mem:vertexml
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
spring.main.allow-bean-definition-overriding=true
server.port=8080"

Write-File "$backend_dir/security/SecurityConfig.java" "package com.vertexml.security;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import java.util.List;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable)
            .cors(cors -> cors.configurationSource(corsConfigurationSource()))
            .authorizeHttpRequests(auth -> auth.anyRequest().permitAll())
            .headers(headers -> headers.frameOptions(f -> f.disable())); // For H2 console
        return http.build();
    }
    
    @Bean
    public UrlBasedCorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowedOrigins(List.of(`"*`"));
        config.setAllowedMethods(List.of(`"*`"));
        config.setAllowedHeaders(List.of(`"*`"));
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration(`"/**`", config);
        return source;
    }
}"

# 2. Upgrade Frontend UI to an Enterprise Dashboard
Write-Host "Upgrading Frontend UI..."
Write-File "$frontend_dir/App.tsx" "import React, { useState, useEffect } from 'react';
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

  const deleteProject = async (id: string) => {
    try {
      await axios.delete(` + "`http://localhost:8080/api/projects/${id}`" + `);
      fetchProjects();
    } catch (e) { console.error('Error deleting project'); }
  };

  return (
    <div className=`"flex h-screen bg-slate-50 font-sans text-slate-800`">
      {/* Sidebar */}
      <div className=`"w-64 bg-slate-900 text-white flex flex-col`">
        <div className=`"p-6 flex items-center border-b border-slate-700`">
          <div className=`"w-8 h-8 bg-blue-500 rounded-md flex items-center justify-center font-bold text-lg mr-3`">V</div>
          <span className=`"text-xl font-bold tracking-tight`">VertexML</span>
        </div>
        <div className=`"p-4 flex-1`">
          <div className=`"mb-2 px-4 py-2 bg-blue-600 rounded-lg cursor-pointer font-medium`">Projects</div>
          <div className=`"mb-2 px-4 py-2 hover:bg-slate-800 rounded-lg cursor-pointer text-slate-300`">Datasets</div>
          <div className=`"mb-2 px-4 py-2 hover:bg-slate-800 rounded-lg cursor-pointer text-slate-300`">Models</div>
          <div className=`"mb-2 px-4 py-2 hover:bg-slate-800 rounded-lg cursor-pointer text-slate-300`">Endpoints</div>
        </div>
      </div>

      {/* Main Content */}
      <div className=`"flex-1 flex flex-col overflow-hidden`">
        {/* Header */}
        <header className=`"h-16 bg-white border-b border-slate-200 flex items-center justify-between px-8`">
          <h1 className=`"text-2xl font-semibold text-slate-800`">Workspaces / Default</h1>
          <div className=`"flex items-center space-x-4`">
            <div className=`"w-8 h-8 bg-slate-200 rounded-full`"></div>
            <span className=`"font-medium`">Admin User</span>
          </div>
        </header>

        {/* Dashboard Body */}
        <main className=`"flex-1 overflow-auto p-8`">
          <div className=`"max-w-5xl mx-auto`">
            <div className=`"flex justify-between items-center mb-6`">
              <h2 className=`"text-xl font-bold text-slate-700`">Active ML Projects</h2>
              <div className=`"flex space-x-2`">
                <input 
                  type=`"text`" 
                  value={newProjectName} 
                  onChange={(e) => setNewProjectName(e.target.value)} 
                  placeholder=`"Enter project name...`" 
                  className=`"px-4 py-2 border border-slate-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500 shadow-sm`"
                />
                <button 
                  onClick={createProject}
                  className=`"bg-blue-600 hover:bg-blue-700 text-white px-5 py-2 rounded-lg font-medium shadow-sm transition-colors`">
                  + Create Project
                </button>
              </div>
            </div>

            <div className=`"bg-white rounded-xl shadow-sm border border-slate-200 overflow-hidden`">
              <table className=`"w-full text-left`">
                <thead className=`"bg-slate-50 border-b border-slate-200`">
                  <tr>
                    <th className=`"px-6 py-4 font-semibold text-sm text-slate-500 uppercase tracking-wider`">Project Name</th>
                    <th className=`"px-6 py-4 font-semibold text-sm text-slate-500 uppercase tracking-wider`">Status</th>
                    <th className=`"px-6 py-4 font-semibold text-sm text-slate-500 uppercase tracking-wider`">ID</th>
                    <th className=`"px-6 py-4 font-semibold text-sm text-slate-500 uppercase tracking-wider text-right`">Actions</th>
                  </tr>
                </thead>
                <tbody className=`"divide-y divide-slate-100`">
                  {projects.length === 0 ? (
                    <tr>
                      <td colSpan={4} className=`"px-6 py-8 text-center text-slate-500`">
                        No projects found. Create one above to get started.
                      </td>
                    </tr>
                  ) : projects.map((p: any) => (
                    <tr key={p.id} className=`"hover:bg-slate-50 transition-colors`">
                      <td className=`"px-6 py-4 whitespace-nowrap font-medium text-slate-800`">{p.name}</td>
                      <td className=`"px-6 py-4 whitespace-nowrap`">
                        <span className=`"px-2.5 py-1 bg-green-100 text-green-700 text-xs font-semibold rounded-full`">Active</span>
                      </td>
                      <td className=`"px-6 py-4 whitespace-nowrap text-sm text-slate-400 font-mono`">{p.id}</td>
                      <td className=`"px-6 py-4 whitespace-nowrap text-right`">
                        <button onClick={() => deleteProject(p.id)} className=`"text-red-500 hover:text-red-700 text-sm font-medium`">Delete</button>
                      </td>
                    </tr>
                  ))}
                </tbody>
              </table>
            </div>
          </div>
        </main>
      </div>
    </div>
  );
}"

Write-Host "Done."
