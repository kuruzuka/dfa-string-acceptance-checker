# DFA String Acceptance Checker

## Objective
Implement a DFA (Deterministic Finite Automaton) that accepts binary strings ending with `01`.

## Description
This project contains two implementations of a DFA string checker:
1. **DFAStringChecker.java** - Full DFA simulation with state transitions
2. **DFAStringCheckerSimple.java** - Simplified version using string matching

## Language Specification
- **Alphabet**: {0, 1}
- **Language**: All binary strings ending with '01'
- **Examples**:
  - ✓ Accepted: `01`, `1101`, `001`, `10101`
  - ✗ Rejected: `1110`, `00`, `1`, `10`

## DFA Design

### States
- **q0** - Start state (initial or after seeing '1')
- **q1** - After seeing '0'
- **q2** - Accept state (after seeing '01')

### State Transitions
```
q0 --0--> q1  (saw '0', waiting for '1')
q0 --1--> q0  (saw '1', reset)
q1 --0--> q1  (another '0', stay in q1)
q1 --1--> q2  (saw '01', move to accept state)
q2 --0--> q1  (new '0', could be start of new '01')
q2 --1--> q0  (saw '1', reset)
```

### State Diagram
```
    1        0        1
q0 ---> q0 ---> q1 ---> q2 (accept)
 ^       |       ^       |
 |       |       |       |
 +-------+       +---0---+
    1                1
```

## How to Compile and Run

### DFAStringChecker (Full DFA Simulation)
```bash
javac DFAStringChecker.java
java DFAStringChecker
```

### DFAStringCheckerSimple (Simplified Version)
```bash
javac DFAStringCheckerSimple.java
java DFAStringCheckerSimple
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
- ✓ Clear state transition logic
- ✓ Detailed comments explaining DFA behavior
- ✓ Error handling for invalid input

## Implementation Details

### DFAStringChecker.java
- Uses enum for state representation
- Simulates DFA by processing each character
- Demonstrates full state machine behavior
- Educational approach showing DFA concepts

### DFAStringCheckerSimple.java
- Uses `endsWith()` method for pattern matching
- More concise and practical
- Same result as full DFA simulation
- Better for production use

## Requirements
- Java Development Kit (JDK) 8 or higher
- Command line or IDE with Java support

## Author
Jim Paolo Pendon  
BSCS  
CS26 - 4381

## Notes
While the simplified version is more efficient for this specific problem, the full DFA implementation demonstrates important concepts in automata theory and is valuable for understanding how finite state machines work.
