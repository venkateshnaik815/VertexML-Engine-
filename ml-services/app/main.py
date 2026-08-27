from fastapi import FastAPI, BackgroundTasks
from pydantic import BaseModel
import time

app = FastAPI(title='VertexML Engine ML Services')

class TrainRequest(BaseModel):
    dataset_name: str
    model_type: str

def simulate_training(dataset_name: str, model_type: str):
    print(f'Starting training for {model_type} on {dataset_name}...')
    time.sleep(5)  # Simulate long training
    print('Training completed and model saved to artifact store.')

@app.post('/api/jobs/train')
def start_training(req: TrainRequest, background_tasks: BackgroundTasks):
    background_tasks.add_task(simulate_training, req.dataset_name, req.model_type)
    return {'status': 'Training job submitted successfully', 'dataset': req.dataset_name}

@app.get('/health')
def health_check():
    return {'status': 'healthy'}
