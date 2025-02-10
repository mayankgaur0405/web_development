// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.util.Random;

// public class NumberGuessingGameUI extends JFrame {
//     private int numberToGuess;
//     private int attempts;
//     private JTextField guessField;
//     private JLabel messageLabel;

//     public NumberGuessingGameUI() {
//         setTitle("Number Guessing Game");
//         setSize(400, 200);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new FlowLayout());

//         numberToGuess = new Random().nextInt(100) + 1;
//         attempts = 0;

//         JLabel instructionLabel = new JLabel("Guess a number between 1 and 100:");
//         guessField = new JTextField(10);
//         JButton guessButton = new JButton("Guess");
//         messageLabel = new JLabel("Good luck!");

//         guessButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 checkGuess();
//             }
//         });

//         add(instructionLabel);
//         add(guessField);
//         add(guessButton);
//         add(messageLabel);
//     }

//     private void checkGuess() {
//         try {
//             int guess = Integer.parseInt(guessField.getText());
//             attempts++;

//             if (guess < numberToGuess) {
//                 messageLabel.setText("Too low! Try again.");
//             } else if (guess > numberToGuess) {
//                 messageLabel.setText("Too high! Try again.");
//             } else {
//                 messageLabel.setText("Correct! You guessed it in " + attempts + " attempts.");
//                 guessField.setEditable(false);
//             }
//         } catch (NumberFormatException e) {
//             messageLabel.setText("Enter a valid number!");
//         }
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> {
//             new NumberGuessingGameUI().setVisible(true);
//         });
//     }
// }
