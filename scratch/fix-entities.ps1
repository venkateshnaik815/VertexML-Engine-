$dir = "c:\Users\VENKATESH NAIK\OneDrive\Documents\Desktop\VertexML Engine ML project\backend-core\src\main\java\com\vertexml\domain"

$files = @("Dataset.java", "Model.java", "Project.java")

foreach ($file in $files) {
    $path = Join-Path $dir $file
    if (Test-Path $path) {
        $content = Get-Content $path -Raw
        if ($content -notmatch "@GeneratedValue") {
            $content = $content -replace "@Id private UUID id;", "@Id @GeneratedValue(strategy=GenerationType.UUID) private UUID id;"
            Set-Content -Path $path -Value $content
        }
    }
}
Write-Host "Fixed entities"
