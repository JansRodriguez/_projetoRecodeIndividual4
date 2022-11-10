import Entradas from '../Form/LabInp';
import Submit  from '../Form/Submit';
import './pages.css';

export default()=>{
    return(
        <section className='form-contato'>
            <h3>Preencha o  formulários com suas dúvidas ou reclamação</h3>
            <Entradas
            texto='Endereço de email'
            tipo='text'
            placeholder={'email@email.com'}
            />
            <Entradas
            texto='Nome Completo'
            />
            <Entradas
            texto='Informe sua reclamação ou comentário'
            tipo='textarea'
            />
            <Submit
            tipo='submit'
            id='submit'
            valor='ENVIAR'
            />
        </section>
    )
}