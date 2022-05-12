package tasks.thursday12may;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        // 1. declare and initialize String array with 7 arbitrary colors.
        // 2. Create new list "colors" (ArrayList) of type String
// 3. Copy/add all elements from String array to colors list
// 4. Remove 3rd element from colors list
// 5. Add new color at the end of the colors list
// 6. Add new color at the beginning of the colors list
// 7. Loop through colors list and output all values (use for each loop)
// 8. Create new list (colorsSublist) which will be sublist of the colors list (will contain elements from
// index 2 to index 5)
//    (hint: take a look at List interface and find a method which you can use to achieve this)
// 9. Use for loop to output each element of colorsSublist list


        String[] colorArray = {"blue", "red", "green", "black", "white", "yellow", "pink"};
        List<String> colors = new ArrayList<>(Arrays.asList(colorArray));
        colors.remove(2);
        colors.add("purple");
        colors.add(0,"gray");
        for (String color:colors){
            System.out.println(color);
        }
        System.out.println("****************");
        List<String> colorsSublist = colors.subList(2,5);
        for (String color:colorsSublist){
            System.out.println(color);
        }


    }
}
