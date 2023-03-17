import java.util.ArrayList;

class SimpleStartup {
    private ArrayList<String> locationCells;

    //#region Código antigo
    // private int[] locationCells;
    // private int numOfHits = 0;
    // private int[] hited = new int[3];
    // private int contador = 0;
    //#endregion

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    //#region Código antigo
    // public String checkYourself(int guess) {
    //     String result = "miss";
    //     for (int cell : locationCells){
    //         if (guess == cell){
    //             if ((guess == hited[0]) || (guess == hited[1]) || (guess == hited[2])) {
    //                 System.out.println("You already hit this cell!");
    //                 result = "miss";
    //                 break;
    //             }
    //             else{
    //                 hited[contador] = guess;
    //                 contador++;
    //                 result = "hit";
    //                 numOfHits++;
    //                 break;
    //             }
    //         }
    //     }
    //     if (numOfHits == locationCells.length){
    //         result = "kill";
    //     }
    //     System.out.println(result);
    //     return result;
    // }
    //#endregion
    
    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }

        System.out.println(result);
        return result;
    }
}
