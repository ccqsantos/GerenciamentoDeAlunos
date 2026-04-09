/* eslint-disable no-unused-vars */
import { useState } from 'react';
import './App.css'
import axios from 'axios';

const App = () => {
  const [successPage, setSuccessPage] = useState(false);
  const [errorPage, setErrorPage] = useState(false);
  const [form, setForm] = useState({
  name: '',           
  birthDate: '',      
  course: '',         
  matricula: ''       
  })

  const handleInput = (event) =>{
      setForm({...form, [event.target.name]: event.target.value});
  }

  const handleSubmit = (event) => {
    event.preventDefault();

    console.log("Curso enviado: ", form.course);
    axios.post('http://localhost:8080/aluno', form)
    .then(res => {
      setSuccessPage(true);
      console.log("Cadastro feito com sucesso!", res.data);
    })
    .catch(err => {
      setErrorPage(true);
      console.log("Erro: ", err.response?.data || err.message);
    })
  }

  if(successPage){
    return (
      <div>
       <span>Cadastro realizado com sucesso!</span>
       <div>
        <button onClick={() => setSuccessPage(false)}>Novo Cadastro</button>
       </div>
      </div>
    )
  }

  if(errorPage){
    return (
      <div>
       <span>Oops... algo deu errado :(</span>
       <div>
        <button onClick={() => setErrorPage(false)}>Tentar Novamente</button>
       </div>
       
      </div>
    )
  }

  return (
      <div id="Form">
        <h1>Cadastro De Alunos</h1>
        <div>
        <form id="cadastro" onSubmit={handleSubmit}> 
          <label htmlFor="name">Nome: </label>
        <input type="text" id="name" required onChange={handleInput} name='name'/>

        <label htmlFor="birthDate">Data de Nascimento: </label>
        <input type="date" id="birthDate" required onChange={handleInput} name='birthDate'></input>

        <label htmlFor="course">Selecione seu curso:</label>

         <select id="course" required onChange={handleInput} name='course'>
          <option value="DESENVOLVIMENTO_DE_SOFTWARE">Desenvolvimento de Software</option>
            <option value="LOGISTICA">Logistica</option>
            <option value="GESTAO_EMPRESARIAL">Gestão Empresarial</option>
            <option value="CIENCIAS_SOCIAIS"> Ciencias Sociais</option>
            <option value="ECONOMIA">Economia</option>
          </select>

          <label htmlFor="matricula">Matricula</label>
          <input type="text" id="matricula" required onChange={handleInput} name='matricula'></input>

            <input type='submit' id="btn-task" value="Cadastrar"/>
        </form>
        </div>
      </div>
  )
}

export default App;
