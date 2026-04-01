import './App.css'

const App = () => {
  return (
        <div id="Form">
        <h1>Cadastro De Alunos</h1>
        <div>
        <form id="cadastro"> 
          <label>Nome: </label>
        <input type="text" id="txt-task"/>

        <label>Data de Nascimento: </label>
        <input type="date" id="date-task"></input>

        <label for="curso">Selecione seu curso:</label>

         <select id="curso" name="curso" required>
          <option value="Desenvolvimento de Software">Desenvolvimento de Software</option>
            <option value="Logistica">Logistica</option>
            <option value="Gestão Empresarial">Gestão Empresarial</option>
            <option value="Ciencias Sociais"> Ciencias Sociais</option>
            <option value="Economia"  >Economia</option>
          </select>

          <label>Matricula</label>
          <input type="text" id="mat-task"></input>

            <button id="btn-task">Cadastrar</button>
            <div id="list-task"></div>
            </form>
            </div>
        </div>
  )
}

export default App;
