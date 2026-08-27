from fastapi import APIRouter
router = APIRouter()
@router.post('/train')
def start_training(): return {'status': 'started'}
