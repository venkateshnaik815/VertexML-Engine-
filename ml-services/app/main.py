from fastapi import FastAPI

app = FastAPI(title='VertexML Engine ML Services')

@app.get('/health')
def health_check():
    return {'status': 'healthy'}
