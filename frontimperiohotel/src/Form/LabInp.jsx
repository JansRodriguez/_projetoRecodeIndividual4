import '../Pages/pages.css';

export default({nome, texto, tipo, placeholder, valor})=>{
    return(
        <div className="form-control">
            <label htmlFor={nome}>{texto}:</label>
            <input id={nome} name={nome} type={tipo} placeholder={placeholder}/>
        </div>
    )
}