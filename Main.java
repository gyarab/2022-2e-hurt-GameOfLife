public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Cell maze = new Cell[]{new Cell(0, 0, 0),};

        Cell[][] maze = {
                { new Cell(0, 0, 1), new Cell(0,1,1),  new Cell(0,2,1)},
                { new Cell(1, 0, 1), new Cell(1,1,1),  new Cell(1,2,1)},
                { new Cell(2, 0, 1), new Cell(2,1,1),  new Cell(2,2,1)},
        };

        Cell[][] maze2 = {
                { new Cell(0, 0, 0), new Cell(0,1,0),  new Cell(0,2,0)},
                { new Cell(1, 0, 0), new Cell(1,1,0),  new Cell(1,2,0)},
                { new Cell(2, 0, 0), new Cell(2,1,0),  new Cell(2,2,0)},
        };


        Cell c;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c = maze[i][j];
                /*
                System.out.print(c.x);
                System.out.print(" ");
                System.out.print(c.y);
                System.out.print(" ");

                 */
                System.out.print(c.stav);
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c = maze[i][j];
               // if(i == 1 && j == 0 ) {
                    int p = SpocitejSousedy(c, maze);
                 //   System.out.println(p);
                //}

                if(c.stav == 0 && p == 3){
                    Cell x = new Cell(i, j, 1);
                    //c.stav = 1;
                    maze2[i][j] = x;
                }
                else if (c.stav == 1) {
                    if(p < 2){
                        //c.stav = 0;
                        Cell x = new Cell(i, j, 0);
                        maze2[i][j] = x;
                    }
                    else if(p > 3){
                        //c.stav = 0;
                        Cell x = new Cell(i, j, 0);
                        maze2[i][j] = x;
                    }
                    else {//zustane stejny stav
                        Cell x = new Cell(i, j, 1);
                        maze2[i][j] = x;
                    }
                }


            }
        }
        System.out.println();
        //probehlo celym polem - ted je dalsi generace ulozena v poli Maze2
        //vyrednrujeme maze2

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c = maze2[i][j];
                /*
                System.out.print(c.x);
                System.out.print(" ");
                System.out.print(c.y);
                System.out.print(" ");

                 */
                System.out.print(c.stav);
            }
            System.out.println();
        }

        //prekopirujeme maze2 do maze


    }

    private static int SpocitejSousedy(Cell c, Cell maze[][]) {
        int sum = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                int col = (c.x + i + 3) % 3;
                int row = (c.y + j + 3) % 3;
                sum += maze[col][row].stav;
            }
        }
        int u = c.x;
        int z = c.y;
        sum = sum - maze[u][z].stav;
        return sum;
    }
}