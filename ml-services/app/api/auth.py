from fastapi import APIRouter, Depends
router = APIRouter()
@router.get('/me')
def get_me(): return {'user': 'dummy'}
