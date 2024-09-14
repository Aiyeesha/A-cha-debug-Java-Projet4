# HemeBiotech - Trend Analysis Program

HemeBiotech is a pharmaceutical company specializing in treating blood disorders in both humans and animals. This repository contains a Java-based trend analysis program designed to read and process symptom data, providing a breakdown of symptom occurrences for further analysis.

## Table of Contents

1. [Context](#context)
2. [Objectives](#objectives)
3. [Prerequisites](#prerequisites)
4. [Installation](#installation)
5. [Usage](#usage)
6. [File Structure](#file-structure)
7. [Made With](#made-with)
8. [Author](#author)

## Context

The program’s main functionality is to read a file (`symptoms.txt`) containing symptom entries, count the number of occurrences for each symptom, and output the results in an alphabetically ordered file (`result.out`). 

The code initially had several issues with counting the symptoms correctly, and as part of the project, the goal was to debug and refactor it using Object-Oriented Programming (OOP) principles for better maintainability and modularity.

## Objectives

- **Fixing Bugs**: Identify and resolve issues in the existing code related to symptom counting.
- **Refactoring**: Apply OOP practices to ensure clean, modular, and reusable code. This includes separating the logic across classes and methods.
- **Documentation**: Ensure that all methods are well-documented using JavaDoc, and the code follows best practices (camelCase naming, indentation, etc.).

## Prerequisites

Before running the program, ensure that you have the following installed:

- **Java** (version 1.8 or higher)
- **Eclipse IDE** (or any Java-compatible IDE)
- **Maven** (for managing dependencies)

Additionally, basic knowledge of:

- Command-line usage
- Git version control
- Object-Oriented Programming concepts

## Installation

To set up the project locally, follow these steps:

1. **Clone the Repository**: Open your terminal or command line and clone the project into a new directory.

   ```bash
   git clone https://github.com/Aiyeesha/Hemebiotech.git
   ```

2. **Open the Project in Eclipse**: After cloning, launch Eclipse and import the project.

   - Navigate to `File -> Import -> Maven -> Existing Maven Projects`.
   - Select the cloned project folder and click `Finish`.

3. **Build the Project**: Maven should automatically resolve dependencies. If not, use:

   ```bash
   mvn clean install
   ```

## Usage

To run the program and see the output:

1. Open the `AnalyticsCounter.java` file in Eclipse.
2. Run the project by right-clicking the `AnalyticsCounter.java` file and selecting `Run As -> Java Application`.
3. The program will read the `symptoms.txt` file and generate an output file named `result.out` in the project’s root folder.

### Example

The `symptoms.txt` file might contain the following lines:

```txt
headache
fever
headache
dizziness
```

The output in `result.out` would look like this:

```txt
dizziness: 1
fever: 1
headache: 2
```

## File Structure

- **src/main/java**: Contains the Java source code.
  - `com/hemebiotech/analytics/ISymptomReader.java`: Interface for reading symptoms.
  - `com/hemebiotech/analytics/ISymptomWriter.java`: Interface for writing symptom data to a file.
  - `com/hemebiotech/analytics/ReadSymptomDataFromFile.java`: Implementation of `ISymptomReader`, reads symptoms from a file.
  - `com/hemebiotech/analytics/WriteSymptomDataToFile.java`: Implementation of `ISymptomWriter`, writes symptom data to a file.
  - `com/hemebiotech/analytics/AnalyticsCounter.java`: Main class responsible for counting, sorting, and writing symptom data.

- **symptoms.txt**: Input file containing the list of symptoms.
- **result.out**: Output file generated after running the program.

## Code Breakdown

### Main Methods

- **getSymptoms()**: Reads symptoms from the input file and returns them as a `List<String>`.
  
  ```java
  public List<String> getSymptoms() { ... }
  ```

- **countSymptoms()**: Counts the occurrences of each symptom and returns a `Map<String, Integer>`.
  
  ```java
  public Map<String, Integer> countSymptoms(List<String> symptoms) { ... }
  ```

- **sortSymptoms()**: Sorts the symptoms in alphabetical order and returns a sorted map.
  
  ```java
  public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) { ... }
  ```

- **writeSymptoms()**: Writes the sorted symptoms and their counts to the output file.
  
  ```java
  public void writeSymptoms(Map<String, Integer> symptoms) { ... }
  ```

## Made With

- **Java** (1.8)
- **Eclipse IDE** (2023-06)
- **Maven** (for dependency management)

## Author

**Aïcha Imène DAHOUMANE**  
GitHub: [@Aiyeesha](https://github.com/Aiyeesha)
