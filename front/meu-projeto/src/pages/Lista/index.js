import ListaDeUsuarios from '../../components/ListaDeUsuarios'
import {useNavigate} from 'react-router-dom'
import './style.css'

function PaginaListaUsuarios(){
    const navigate = useNavigate()

    return (
    
        <div className = 'pagina-lista-usuarios'>
        <div className = 'container'>
        <h2>Lista de Usuarios</h2>
        <ListaDeUsuarios />
        <button onClick = {() => navigate('/')} className = 'link-voltar'>Cadastrar Usuário</button> 
        
        </div>
        </div>
    )

}

export default PaginaListaUsuarios