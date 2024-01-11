FROM python:3.8-slim

# Create and set the working directory to /app
WORKDIR /app

# Copy the requirements file to the container
COPY requirements.txt ./

# Install the dependencies
RUN pip install --no-cache-dir -r requirements.txt

# Copy the rest of the application source code
COPY . .

# Command to run the application
CMD ["python", "./app.py"]