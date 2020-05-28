package main.java.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import main.java.Solver;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class MainController {

    @FXML
    private TextField gcdValue;

    @FXML TextField lcmValue;

    @FXML
    private Label invalidFormat;

    @FXML
    private TextField solveField;

    @FXML
    private void click() {
        invalidFormat.setVisible(false);
        Solver solver = new Solver();
        StringTokenizer s = new StringTokenizer(solveField.getText());
        ArrayList<Long> nums = new ArrayList<>();
        try {
            if(!s.hasMoreElements()) {
                invalidFormat.setVisible(true);
            }
            while (s.hasMoreElements()) {
                nums.add(Long.parseLong(s.nextToken()));
            }

        } catch(Exception e) {
            invalidFormat.setVisible(true);
        }
        ArrayList<Long> nums2 = new ArrayList<>(nums);
        try {
            gcdValue.setText(Long.toString(solver.gcd(nums)));
            lcmValue.setText(Long.toString(solver.lcm(nums2)));
        } catch (IndexOutOfBoundsException e) {
            invalidFormat.setVisible(true);
        }

    }
}
