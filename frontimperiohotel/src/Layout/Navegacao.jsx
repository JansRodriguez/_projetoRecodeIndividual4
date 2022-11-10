import {Link} from 'react-router-dom';

export default()=>{
    return(
        <ul className="navbar">
            <li><Link to='/'>HOME</Link></li>
            <li><Link to='/Destino'>DESTINO</Link></li>
            <li><Link to='/Promocoes'>PROMOÇÃO</Link></li>
            <li><Link to='/Contato'>CONTATO</Link></li>
            <li><button>Login</button>
            <button>Sing-up</button>
            </li>
        </ul>
    )
}