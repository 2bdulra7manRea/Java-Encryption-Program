
# Encryption Program

This is a desktop program written in Java that allows the user to encrypt and decrypt messages using the one-time pad (OTP) encryption technique. OTP is a secure encryption method that relies on a pre-shared key that is used only once.

## Functionality

The program has the following features:

- A text field where the user can enter the message to be encrypted.
- A button that generates a random key of the same length as the message.
- The message and the key are converted to binary format.
- The binary message and key are combined using the XOR logical operator to generate the cipher.
- The cipher is converted to text and displayed on the screen.
- The user can decrypt the message by entering the cipher and the key, and clicking on a button.
- The original message is displayed on the screen.
- The program does not allow the user to verify the message again, as the key is valid only once.
- The user can exit the program by clicking on the close button in the top left corner of the screen.

## Prerequisites

To run the program, you need to have Java 8 or later installed on your system.

## How to run the program

To run the program, follow these steps:

1. Clone the repository or download the source code.
2. Open a terminal window and navigate to the project directory.
3. Compile the program by running the following command:
```
javac EncryptionProgram.java
```
4. Run the program by running the following command:
```
java EncryptionProgram
```

## License

This program is licensed under the [MIT License](LICENSE).
