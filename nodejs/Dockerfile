FROM node:20-alpine

# Create app directory
WORKDIR /usr/src/app

# Copy package.json and package-lock.json
COPY package*.json ./

# Install app dependencies without using cache
RUN npm install --no-cache

# Bundle app source
COPY . .

# Your application's default port
EXPOSE 8080

# Start the application
CMD ["npm", "start"]