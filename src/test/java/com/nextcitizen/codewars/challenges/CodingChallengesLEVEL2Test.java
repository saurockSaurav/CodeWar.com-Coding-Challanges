package com.nextcitizen.codewars.challenges;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CodingChallengesLEVEL2.class)
public class CodingChallengesLEVEL2Test {

	@Autowired
	private CodingChallengesLEVEL2 codingChallengesLEVEL2;

	/**
	 * Given two numbers and an arithmetic operator (the name of it, as a string),
	 * return the result of the two numbers The four operators are "add",
	 * "subtract", "divide", "multiply". example: arithmetic(5, 2, "add") => returns
	 * 7
	 */
	@Test
	public void test_findArithemticOpearationByOperator() {
		assertEquals(4, codingChallengesLEVEL2.findArithemticOpearationByOperator(2, 2, "aDD"));
		assertEquals(0, codingChallengesLEVEL2.findArithemticOpearationByOperator(2, 2, "subTracT"));
		assertEquals(1, codingChallengesLEVEL2.findArithemticOpearationByOperator(2, 2, "DIVIDE"));
		assertEquals(6, codingChallengesLEVEL2.findArithemticOpearationByOperator(3, 2, "mulTIPLY"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_findArithemticOpearationByOperatorException() {
		assertEquals(0, codingChallengesLEVEL2.findArithemticOpearationByOperator(2, 2, "   "));
		assertEquals(0, codingChallengesLEVEL2.findArithemticOpearationByOperator(2, 2, "DE"));
		assertEquals(0, codingChallengesLEVEL2.findArithemticOpearationByOperator(3, 2, "PLY"));
	}

	/**
	 * Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
	 * 
	 * Jaden-Cased: "How Can Mirrors Be Real If Our Eyes Aren't Real"
	 * 
	 */

	@Test
	@Ignore
	public void test_convertStringToJadenSmithFormat() {
		assertEquals("How Can Mirrors Be Real If Our Eyes Aren't Real", codingChallengesLEVEL2
				.convertStringToJadenSmithFormat("How can mirrors be real if our eyes aren't real"));

	}

	@Test
	public void test_convertStringToJadenSmithFormat_WhenInputIs_Null() {
		assertNull("Must return null value", codingChallengesLEVEL2.convertStringToJadenSmithFormat(null));

	}

	@Test
	public void test_convertStringToJadenSmithFormat_WhenInputIs_Blank() {
		assertNull("Must return null value", codingChallengesLEVEL2.convertStringToJadenSmithFormat("   "));
	}

	/**
	 * Examples input/output: XO("ooxx") => true XO("xooxx") => false XO("ooxXm") =>
	 * true XO("zpzpzpp") => true // when no 'x' and 'o' is present should return
	 * true XO("zzoo") => false
	 */

	@Test
	public void test_hasEquaslAmountOfXandO() {

		assertTrue(codingChallengesLEVEL2.hasEquaslAmountOfXandO("ooxx"));
		assertFalse(codingChallengesLEVEL2.hasEquaslAmountOfXandO("XxxxooO"));
		assertFalse(codingChallengesLEVEL2.hasEquaslAmountOfXandO("xXxxoewrcoOoo"));
		assertFalse(codingChallengesLEVEL2.hasEquaslAmountOfXandO("xxx23424esdsfvxXXOOooo"));
		assertFalse(codingChallengesLEVEL2.hasEquaslAmountOfXandO("xooxx"));
		assertTrue(codingChallengesLEVEL2.hasEquaslAmountOfXandO("ooxXm"));
		assertTrue(codingChallengesLEVEL2.hasEquaslAmountOfXandO("zpzpzpp"));
		assertTrue(codingChallengesLEVEL2.hasEquaslAmountOfXandO("zssddd"));
		assertFalse(codingChallengesLEVEL2.hasEquaslAmountOfXandO("Xxxxertr34"));

	}

	@Test
	public void test_hasEquaslAmountOfXandO_WhenNoneIsPresent() {
		assertTrue(codingChallengesLEVEL2.hasEquaslAmountOfXandO("ABCD"));
		assertTrue(codingChallengesLEVEL2.hasEquaslAmountOfXandO("abcd"));
		assertFalse(codingChallengesLEVEL2.hasEquaslAmountOfXandO("zzoo"));
		assertFalse(codingChallengesLEVEL2.hasEquaslAmountOfXandO("ZoZo"));
		assertTrue(codingChallengesLEVEL2.hasEquaslAmountOfXandO("1-9A-z"));
	}

	/**
	 * Example: 
	 *    isAscOrder(new int[]{1,2,4,7,19}) == true 
	 *    isAscOrder(new int[]{1,2,3,4,5}) == true
	 *    isAscOrder(new int[]{1,6,10,18,2,4,20}) == false
	 *    isAscOrder(new int[]{9,8,7,6,5,4,3,2,1}) == false
	 * 
	 */
	@Test
	public void test_isNumberInAscendingOrder() {
		assertTrue(codingChallengesLEVEL2.isNumberInAscendingOrder(new int[] { 1, 2, 3 }));
		assertFalse(codingChallengesLEVEL2.isNumberInAscendingOrder(new int[] { 1, 3, 2 }));
		assertTrue(codingChallengesLEVEL2.isNumberInAscendingOrder(new int[] { 1, 4, 13, 97, 508, 1047, 20058 }));
		assertFalse(codingChallengesLEVEL2.isNumberInAscendingOrder(new int[] { 56, 98, 123, 67, 742, 1024, 32, 90969 }));
	}

	@Test
	public void test_isNumberInAscendingOrder_moreAdvancedCases() {
		assertTrue(codingChallengesLEVEL2.isNumberInAscendingOrder(new int[] { 1, 4, 13, 97, 508, 1047, 20058 }));
		assertFalse(codingChallengesLEVEL2.isNumberInAscendingOrder(new int[] { 56, 98, 123, 67, 742, 1024, 32, 90969 }));
	}

}
