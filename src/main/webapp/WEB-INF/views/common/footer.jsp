<hr>
<footer>
  <p>&copy; Company 2012</p>
</footer>
<div class="modal fade" id="delete-dialog">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h3>Confirm Delete?</h3>
      </div>
      <div class="modal-body">
        <p>Are you sure want to <strong>delete</strong> this record?</p>
      </div>
      <div class="modal-footer">
        <form name="delete" action="user/delete" method="POST">
          <input type="hidden" name="id" value="-1">
          <button class="btn btn-danger"><i class="icon-exclamation-sign icon-white"></i> Yes</button>
          <button type="button" class="btn btn-default" data-dismiss="modal">No</button>
        </form>
      </div>
    </div>
  </div>
</div>

