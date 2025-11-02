# DFA String Acceptance Checker

## Objective
Implement a DFA (Deterministic Finite Automaton) that accepts binary strings ending with `01`.

## Description
This program implements a DFA that checks if a binary string ends with '01'. The program validates the input and determines whether the string is accepted or rejected based on the DFA's language specification.

## Language Specification
- **Alphabet**: {0, 1}
- **Language**: All binary strings ending with '01'
- **Examples**:
  - ✓ Accepted: `01`, `1101`, `001`, `10101`
  - ✗ Rejected: `1110`, `00`, `1`, `10`

## How to Compile and Run

### Compilation
```bash
javac DFAStringChecker.java
```

### Execution
```bash
java DFAStringChecker
```

## Sample Input/Output

### Example 1
```
Input: 1101
Output: Accepted
```

### Example 2
```
Input: 1110
Output: Rejected
```

### Example 3
```
Input: 01
Output: Accepted
```

### Example 4
```
Input: 00
Output: Rejected
```

## Features
- ✓ Input validation (only accepts binary strings)
- ✓ Efficient pattern matching
- ✓ Clear and concise code
- ✓ Error handling for invalid input
- ✓ User-friendly input/output format

## Implementation Details
- Uses `endsWith("01")` method to check if string ends with '01'
- Validates input using regex pattern `[01]+` to ensure only binary digits
- Returns "Accepted" if string ends with '01', otherwise "Rejected"
- Handles edge cases and invalid input gracefully

## Requirements
- Java Development Kit (JDK) 8 or higher
- Command line or IDE with Java support

## Author
Jim Paolo Pendon  
BSCS  
CS26 - 4381

## How It Works
The program reads a binary string from the user, validates that it contains only 0s and 1s, and then checks if the string ends with the pattern '01'. If the pattern is found at the end of the string, the DFA accepts it; otherwise, it rejects it.

## Screenshots
<img width="180" height="64" alt="image" src="https://github.com/user-attachments/assets/cbefd72e-f7d7-4352-9a36-ceb8515363d4" />

<img width="199" height="74" alt="image" src="https://github.com/user-attachments/assets/13c29c09-50c9-4fdf-baa2-7ac6b4bbbc1c" />


