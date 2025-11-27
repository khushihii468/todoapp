async function register(){
  const username = document.getElementById('username').value;
  const res = await fetch('/api/users/register', {
    method:'POST',
    headers:{'Content-Type':'application/json'},
    body: JSON.stringify({username, email: username+'@x.com', passwordHash:'demo'})
  });
  const data = await res.json();
  alert('Registered id: '+data.id);
}

async function createTodo(){
  const userId = document.getElementById('userId').value;
  const title = document.getElementById('title').value;
  await fetch('/api/todos', {
    method:'POST',
    headers:{'Content-Type':'application/json'},
    body: JSON.stringify({title, description:'', dueDate:'2025-12-01', status:'NEW', userId:parseInt(userId)})
  });
  loadTodos(userId);
}

async function loadTodos(userId){
  if(!userId) return alert('enter userId');
  const res = await fetch('/api/todos?userId='+userId);
  const todos = await res.json();
  const ul = document.getElementById('list');
  ul.innerHTML = '';
  todos.forEach(t => { const li = document.createElement('li'); li.textContent = t.title + ' - ' + t.status; ul.appendChild(li); });
}
