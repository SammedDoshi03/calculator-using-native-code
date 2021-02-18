#include <stdio.h>
#include <math.h>
#include <jni.h>
#include "deathNote.h"
JNIEXPORT jint JNICALL Java_deathNote_addition(JNIEnv *eve, jobject obj, jint a, jint b)
{
    return a + b;
}

JNIEXPORT jint JNICALL Java_deathNote_subtraction(JNIEnv *eve, jobject obj, jint a, jint b)
{
    return a - b;
}

/*
 * Class:     deathNote
 * Method:    multiplication
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_deathNote_multiplication(JNIEnv *eve, jobject obj, jint a, jint b)
{
    return a * b;
}

/*
 * Class:     deathNote
 * Method:    division
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_deathNote_division(JNIEnv *eve, jobject obj, jint a, jint b)
{
    return a / b;
}

/*
 * Class:     deathNote
 * Method:    sine
 * Signature: (I)F
 */
JNIEXPORT jfloat JNICALL Java_deathNote_sine(JNIEnv *eve, jobject obj, jint a)
{
    return sin(a*3.142/180);
}

/*
 * Class:     deathNote
 * Method:    cosine
 * Signature: (I)F
 */
JNIEXPORT jfloat JNICALL Java_deathNote_cosine(JNIEnv *eve, jobject obj, jint a)
{
    return cos(a*3.142/180);
}

/*
 * Class:     deathNote
 * Method:    tangent
 * Signature: (I)F
 */
JNIEXPORT jfloat JNICALL Java_deathNote_tangent(JNIEnv *eve, jobject obj, jint a)
{
    return tan(a*3.142/180);
}

/*
 * Class:     deathNote
 * Method:    sqrt
 * Signature: (I)F
 */
JNIEXPORT jfloat JNICALL Java_deathNote_sqrt(JNIEnv *eve, jobject obj, jint a)
{
    return sqrt(a);
}
