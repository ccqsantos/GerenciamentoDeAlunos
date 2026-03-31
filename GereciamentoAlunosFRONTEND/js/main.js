// txt-task
// list-task

document.onreadystatechange = () => {
    if(document.readyState == 'complete'){
        const btn = document.getElementById('btn-task');
        btn.onclick = addTask;
    }
}

const addTask = () => {
    const description = document.getElementById('txt-task').value;
    const data = {"description": description};

    fetch('http://localhost:8080/tasks', {
        method: 'POST',
        body: JSON.stringify(data),
        headers: {'Content-Type':'application/json'},
    })
    .then(response => response.json())
    .then(dataResponse => console.log(dataResponse));
}