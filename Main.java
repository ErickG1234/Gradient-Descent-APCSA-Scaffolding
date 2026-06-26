public class Main {
    public static void main(String[] args) {
        double[] pace = {70.0, 75.0, 80.0, 85.0, 90.0, 95.0};
        double[] overallRatings = {72.0, 76.0, 81.0, 84.0, 89.0, 93.0};
        double weight = 0.0;
        double learningRate = 0.0001;
    
        // --- The final training loop will go here! ---
        // Hint: Put these print statements INSIDE your loop so you can watch the model learn!
        // System.out.println("Weight: " + weight);
        // System.out.println("Error: " + calculateError(pace, overallRatings, weight));
        // ---------------------------------------------
        
        System.out.println("Final Weight: " + weight);
        
        for (int i = 0; i < pace.length; i++) {
            System.out.println("Prediction: " + pace[i] * weight  + ", Overall Rating: " + overallRatings[i]);
        }
    }

    public static double calculateError(double[] pace, double[] overallRatings, double weight) {
        double error = 0.0;

        // Iterate through all the players

        // calculate the error
           
        // square it
           
        // divide it by 6 (amount of players)

        return error;  
    }
        
    public static double calculateGradient(double[] pace, double[] overallRatings, double weight) {
        double gradient = 0.0;
        
        // Iterate through all the players

        // calculate Gradient

        // divide it by 6 (amount of players)
                   
        return gradient;
    }
}