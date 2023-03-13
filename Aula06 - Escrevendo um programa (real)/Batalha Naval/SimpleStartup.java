class SimpleStartup {
    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(int guess) {
        String result = "miss";
        int[] hited = new int[3];
        int i = 0;
        for (int cell : locationCells){
            if (guess == cell){
                if ((guess == hited[0]) || (guess == hited[1]) || (guess == hited[2])) {
                    System.out.println("You already hit this cell!");
                    result = "miss";
                    break;
                }
                else{
                    hited[i] = guess;
                    i++;
                    result = "hit";
                    numOfHits++;
                    break;
                }
            }
        }
        if (numOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
