var spiralOrder = function(matrix) {
    if (matrix == null || matrix.length === 0) return [];

  const dirs = [[0, 1], [1, 0], [0, -1], [-1, 0]];// right, down, left, up
  const steps = [matrix[0].length, matrix.length - 1];
    // console.log( matrix[0]);
  let dir = 0;
  let x = 0;
  let y = -1;
  const res = [];

  while (steps[dir % 2] > 0) {
    for (let i = 0; i < steps[dir % 2]; i++) {
      x += dirs[dir][0];
      y += dirs[dir][1];
      res.push(matrix[x][y]);
    }
    steps[dir % 2]--;
     // console.log(steps);
    dir = (dir + 1) % 4;
  }
  return res;

};
