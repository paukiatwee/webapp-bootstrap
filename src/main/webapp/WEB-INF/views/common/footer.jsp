<hr>
<footer>
  <p>&copy; Company 2012</p>
</footer>
<div class="modal hide fade" id="delete-dialog">
  <div class="modal-header">
    <a class="close" data-dismiss="modal">×</a>
    <h3>Confirm Delete?</h3>
  </div>
  <div class="modal-body">
    <p>Are you sure want to <strong>delete</strong> this record?</p>
  </div>
  <div class="modal-footer">
    <form name="delete" action="user/delete" method="POST">
      <input type="hidden" name="id" value="-1">      
      <button class="btn btn-danger"><i class="icon-exclamation-sign icon-white"></i> Yes</button>
      <a href="#" class="btn" data-dismiss="modal">No</a>
    </form>
  </div>
</div>
