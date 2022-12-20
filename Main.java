public class Main {
    static int RADKY = 10;//potrebujeme velikosti bludiste z ComboBoxu
    static int SLOUPCE = 10;
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Cell[][] maze = {
                { new Cell(0, 0, 0), new Cell(0,1,0),  new Cell(0,2,0), new Cell(0,3,0), new Cell(0,4,0), new Cell(0,5,0), new Cell(0,6,0), new Cell(0,7,0), new Cell(0,8,0), new Cell(0,9,0)},
                { new Cell(1, 0, 0), new Cell(1,1,0),  new Cell(1,2,0), new Cell(1,3,1), new Cell(1,4,1), new Cell(1,5,1), new Cell(1,6,1), new Cell(1,7,0), new Cell(1,8,0), new Cell(1,9,0)},
                { new Cell(2, 0, 1), new Cell(2,1,1),  new Cell(2,2,1), new Cell(2,3,0), new Cell(2,4,0), new Cell(2,5,0), new Cell(2,6,0), new Cell(2,7,1), new Cell(2,8,1), new Cell(2,9,0)},
                { new Cell(3, 0, 1), new Cell(3,1,0),  new Cell(3,2,0), new Cell(3,3,0), new Cell(3,4,0), new Cell(3,5,1), new Cell(3,6,0), new Cell(3,7,0), new Cell(3,8,1), new Cell(3,9,1)},
                { new Cell(4, 0, 0), new Cell(4,1,0),  new Cell(4,2,0), new Cell(4,3,1), new Cell(4,4,1), new Cell(4,5,0), new Cell(4,6,1), new Cell(4,7,0), new Cell(4,8,0), new Cell(4,9,0)},
                { new Cell(5, 0, 0), new Cell(5,1,0),  new Cell(5,2,0), new Cell(5,3,1), new Cell(5,4,0), new Cell(5,5,0), new Cell(5,6,0), new Cell(5,7,0), new Cell(5,8,0), new Cell(5,9,0)},
                { new Cell(6, 0, 0), new Cell(6,1,0),  new Cell(6,2,1), new Cell(6,3,0), new Cell(6,4,0), new Cell(6,5,1), new Cell(6,6,1), new Cell(6,7,0), new Cell(6,8,0), new Cell(6,9,0)},
                { new Cell(7, 0, 0), new Cell(7,1,0),  new Cell(7,2,0), new Cell(7,3,0), new Cell(7,4,0), new Cell(7,5,1), new Cell(7,6,1), new Cell(7,7,0), new Cell(7,8,0), new Cell(7,9,0)},
                { new Cell(8, 0, 0), new Cell(8,1,0),  new Cell(8,2,0), new Cell(8,3,0), new Cell(8,4,0), new Cell(8,5,0), new Cell(8,6,0), new Cell(8,7,0), new Cell(8,8,0), new Cell(8,9,0)},
                { new Cell(9, 0, 0), new Cell(9,1,0),  new Cell(9,2,0), new Cell(9,3,0), new Cell(9,4,0), new Cell(9,5,0), new Cell(9,6,0), new Cell(9,7,0), new Cell(9,8,0), new Cell(9,9,0)},
        };
        
        
        Cell[][] maze2 = {
                { new Cell(0, 0, 0), new Cell(0,1,0),  new Cell(0,2,0), new Cell(0,3,0), new Cell(0,4,0), new Cell(0,5,0), new Cell(0,6,0), new Cell(0,7,0), new Cell(0,8,0), new Cell(0,9,0)},
                { new Cell(1, 0, 0), new Cell(1,1,0),  new Cell(1,2,0), new Cell(1,3,0), new Cell(1,4,0), new Cell(1,5,0), new Cell(1,6,0), new Cell(1,7,0), new Cell(1,8,0), new Cell(1,9,0)},
                { new Cell(2, 0, 0), new Cell(2,1,0),  new Cell(2,2,0), new Cell(2,3,0), new Cell(2,4,0), new Cell(2,5,0), new Cell(2,6,0), new Cell(2,7,0), new Cell(2,8,0), new Cell(2,9,0)},
                { new Cell(3, 0, 0), new Cell(3,1,0),  new Cell(3,2,0), new Cell(3,3,0), new Cell(3,4,0), new Cell(3,5,0), new Cell(3,6,0), new Cell(3,7,0), new Cell(3,8,0), new Cell(3,9,0)},
                { new Cell(4, 0, 0), new Cell(4,1,0),  new Cell(4,2,0), new Cell(4,3,0), new Cell(4,4,0), new Cell(4,5,0), new Cell(4,6,0), new Cell(4,7,0), new Cell(4,8,0), new Cell(4,9,0)},
                { new Cell(5, 0, 0), new Cell(5,1,0),  new Cell(5,2,0), new Cell(5,3,0), new Cell(5,4,0), new Cell(5,5,0), new Cell(5,6,0), new Cell(5,7,0), new Cell(5,8,0), new Cell(2,9,0)},
                { new Cell(6, 0, 0), new Cell(6,1,0),  new Cell(6,2,0), new Cell(6,3,0), new Cell(6,4,0), new Cell(6,5,0), new Cell(6,6,0), new Cell(6,7,0), new Cell(6,8,0), new Cell(6,9,0)},
                { new Cell(7, 0, 0), new Cell(7,1,0),  new Cell(7,2,0), new Cell(7,3,0), new Cell(7,4,0), new Cell(7,5,0), new Cell(7,6,0), new Cell(7,7,0), new Cell(7,8,0), new Cell(7,9,0)},
                { new Cell(8, 0, 0), new Cell(8,1,0),  new Cell(8,2,0), new Cell(8,3,0), new Cell(8,4,0), new Cell(8,5,0), new Cell(8,6,0), new Cell(8,7,0), new Cell(8,8,0), new Cell(8,9,0)},
                { new Cell(9, 0, 0), new Cell(9,1,0),  new Cell(9,2,0), new Cell(9,3,0), new Cell(9,4,0), new Cell(9,5,0), new Cell(9,6,0), new Cell(9,7,0), new Cell(9,8,0), new Cell(9,9,0)},
        };

        int generace = 0;
        for (int v = 0; v < 11; v++) {
            System.out.println("generace c. "+generace);
            generace++;

            //vypiseme zacatecni stav
            System.out.println("zacatecni konfigurace: ");
            Cell c;
            for (int i = 0; i < RADKY; i++) {
                for (int j = 0; j < SLOUPCE; j++) {
                    c = maze[i][j];
                    System.out.print(c.stav);
                }
                System.out.println();
            }

            //projdeme cely maze - kazda bunka spravne zapis svuj novy stav do maze2
            for (int i = 0; i < RADKY; i++) {
                for (int j = 0; j < SLOUPCE; j++) {
                    c = maze[i][j];
                    int p = SpocitejSousedy(c, maze);

                    if (c.stav == 0 && p == 3) {
                        Cell x = new Cell(i, j, 1);
                        maze2[i][j] = x;
                    } 
                    else if (c.stav == 1) {
                        if (p < 2) {
                            Cell x = new Cell(i, j, 0);
                            maze2[i][j] = x;
                        } 
                        else if (p > 3) {
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

            for (int i = 0; i < RADKY; i++) {
                for (int j = 0; j < SLOUPCE; j++) {
                    c = maze2[i][j];
                    System.out.print(c.stav);
                }
                System.out.println();
            }

            //prekopirujeme maze2 do maze
            for (int i = 0; i < RADKY; i++) {
                for (int j = 0; j < SLOUPCE; j++) {
                    maze[i][j] = maze2[i][j];
                }
            }
        }
        
    }

    private static int SpocitejSousedy(Cell c, Cell maze[][]) {
        int sum = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                int col = (c.x + i + SLOUPCE) % SLOUPCE;
                int row = (c.y + j + SLOUPCE) % SLOUPCE;
                sum += maze[col][row].stav;
            }
        }
        int u = c.x;
        int z = c.y;
        sum = sum - maze[u][z].stav;
        return sum;
    }
}
