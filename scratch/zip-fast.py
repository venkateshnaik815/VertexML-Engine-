import os
import zipfile

def zipdir(path, ziph):
    for root, dirs, files in os.walk(path):
        # Exclude directories
        dirs[:] = [d for d in dirs if d not in ['node_modules', 'target', '__pycache__']]
        for file in files:
            file_path = os.path.join(root, file)
            arcname = os.path.relpath(file_path, path)
            ziph.write(file_path, arcname)

if __name__ == '__main__':
    source_dir = r"C:\Users\VENKATESH NAIK\OneDrive\Documents\Desktop\VertexML Engine ML project"
    output_zip = r"C:\Users\VENKATESH NAIK\OneDrive\Documents\Desktop\VertexML_Engine_Project_Final.zip"
    
    print(f"Creating zip file: {output_zip}...")
    with zipfile.ZipFile(output_zip, 'w', zipfile.ZIP_DEFLATED) as zipf:
        zipdir(source_dir, zipf)
    print("Zip file created successfully.")
