
export default({tipo, nome, valor, linha})=>{
    return(
        <div className="submit">
            <input type={tipo} id={nome} value={valor}/>
        </div>
    )
}