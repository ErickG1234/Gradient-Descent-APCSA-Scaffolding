public class Main {
    public static void main(String[] args) {
        // Player's Speed
        double[] pace = {70.0, 75.0, 80.0, 85.0, 90.0, 95.0};

        // Player's Overall Performance
        double[] overallRatings = {72.0, 76.0, 81.0, 84.0, 89.0, 93.0};


        double weight = 0.0;
        double learningRate = 0.0001;
    
       // This loop trains the model by adjusting the weight based on the calculated gradient and learning rate
        for (int i = 0; i < 10; i++) {
            weight = /* TODO: subtract the weight by the learningRate times the gradient */
            System.out.println("Weight: " + weight);
            System.out.println("Error: " + calculateError(pace, overallRatings, weight));
        }
        
        System.out.println("Final Weight: " + weight);
        
        for (int i = 0; i < pace.length; i++) {
            System.out.println("Prediction: " + pace[i] * weight  + ", Overall Rating: " + overallRatings[i]);
        }
    }

    // TODO: Implement the calculation for the calculateError method 
    // Here, you are finding the mean sqaured error between the pace stats and the actual overallRatings.
    // Return the final error
    public static double calculateError(double[] pace, double[] overallRatings, double weight) {
        double error = 0.0;

        // Iterate through the players 

        // calculate the error
           
        // square the error
           
        // divide it by 6 (amount of players)

        return error;  
    }
    // TODO: Implement the calculation for the calculateGradient method 
    // Here, you are using the predicted and actual overallRating to find the gradient (rate of change)
    // of the error with respect to the weight
    // Return the final gradient.    
    public static double calculateGradient(double[] pace, double[] overallRatings, double weight) {
        double gradient = 0.0;
        
        // Iterate through all the players

        // calculate Gradient

        // divide it by 6 (amount of players)
                   
        return gradient;
    }
}