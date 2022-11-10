import {BrowserRouter as Router, Routes, Route} from 'react-router-dom';

import Header from './Layout/Cabecalho';
import Navbar from './Layout/Navegacao';
import Rodapé from './Layout/Rodapé';'./Layout/Rodapé';

import Home from './Pages/Home';
import Destino from './Pages/Destino';
import Contato from './Pages/Contato';
import Promocoes from './Pages/Promocoes';

export default()=>{
    return(
        <Router>
            <Header/>
            <Navbar/>
                <Routes>
                    <Route path='/' element={<Home/>}/>
                    <Route path='/Destino' element={<Destino/>}/>
                    <Route path='/Contato' element={<Contato/>}/>
                    <Route path='/Promocoes' element={<Promocoes/>}/>
                </Routes>
            <Rodapé/>
        </Router>
    )    
};