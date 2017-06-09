
function onLikeClick() {
  var countValue = document.getElementById('like-count-value').innerHTML;

  document.getElementById('like-count-value').innerHTML = parseInt(countValue)+1;
}
