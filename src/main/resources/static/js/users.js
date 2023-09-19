// Call the dataTables jQuery plugin
$(document).ready(function() {
  loadUsers();
  $('#users').DataTable();
});

async function loadUsers() {

  const request = await fetch('users', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  const users = await request.json();

  let listHTML = "";
  for (let user of users) {
  let userHTML = '<tr><td>' + user.id + '</td><td>' + user.name + ' ' + user.lastName + '</td><td>'
  + user.email + '</td><td> '
  + user.phone + '</td><td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>';
  listHTML += userHTML;
  }

  document.querySelector('#users tbody').outerHTML = listHTML;
}