package de.syngenio.demo3;

public class Actor {
	public void moveMotor(int amount) {
		/*
		 * This method should move the motor by the given amount.
		 * The motor should be moved by the given amount.
		 * If the amount is positive, the motor should be moved in the direction of heating.
		 * If the amount is negative, the motor should be moved in the direction of cooling.
		 * The motor should be stopped if the amount is 0.
		*/
		 if (amount > 0) {
            System.out.println("Moving motor in the direction of heating by " + amount);
        } else if (amount < 0) {
            System.out.println("Moving motor in the direction of cooling by " + (-amount));
        } else {
            System.out.println("Stopping motor");
        }
    }
	};
	public void stopMotor() {
		/*
		 * This method should stop the motor.
		*/
		System.out.println("Stopping motor");
	};
}
