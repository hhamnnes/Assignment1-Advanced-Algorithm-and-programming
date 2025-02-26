import json
import matplotlib.pyplot as plt
import os

file_path = r"X:\Onedrive\Dokumenter\Høgskolen i Østfold\4.Semster\II.2415 Advanced Algorithmic & Programming\Assignments\Assignment 1 v2\Output\IterativeAlgorithmExecutionTimeData.json"

# Les JSON-data fra filen
with open(file_path, 'r') as file:
    data = json.load(file)

# Ekstraher data for plotting
numbers = [entry["Number"] for entry in data]
execution_times = [entry["ExecutionTime"] for entry in data]

# Lag en graf
plt.plot(numbers, execution_times, marker='o')

# Legg til tittel og etiketter
plt.title('Execution Time vs Number')
plt.xlabel('Number')
plt.ylabel('Execution Time (ns)')

# Vis grafen
plt.show()