package de.syngenio.robot;

import static org.mockito.Mockito.inOrder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestSpiral {
	
	@Mock private Robot robot;
	private Spiral spiral;

	@BeforeEach
	public void setUp() {
		spiral = new Spiral(robot);
	}
	
	@Test
	public void assureThatRobotWalksSpiral() {
		InOrder inorder = inOrder(robot);
		
		spiral.walkSpiral();
		
		inorder.verify(robot).move(1);
		inorder.verify(robot).turnleft(90);
		inorder.verify(robot).move(1);
		inorder.verify(robot).turnleft(90);

		inorder.verify(robot).move(2);
		inorder.verify(robot).turnleft(90);
		inorder.verify(robot).move(2);
		inorder.verify(robot).turnleft(90);

		inorder.verify(robot).move(3);
		inorder.verify(robot).turnleft(90);
		inorder.verify(robot).move(3);
		inorder.verify(robot).turnleft(90);

		inorder.verify(robot).move(4);
		inorder.verify(robot).turnleft(90);
		inorder.verify(robot).move(4);
		inorder.verify(robot).turnleft(90);

		inorder.verify(robot).move(5);
		inorder.verify(robot).turnleft(90);
		inorder.verify(robot).move(5);
		inorder.verify(robot).turnleft(90);
	}

}
