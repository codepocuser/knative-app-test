FROM node:20-alpine

# Create app directory and set the right permissions
RUN mkdir -p /home/node/app && chown -R node:node /home/node/app

# Set the working directory
WORKDIR /home/node/app

# Copy package.json and package-lock.json with appropriate permissions
COPY --chown=node:node package*.json ./

# Set the HOME environment variable for the node user
# Ensure that npm uses a cache directory within the node user's home directory
ENV HOME=/home/node
ENV NPM_CONFIG_CACHE=$HOME/.npm

# Switch to the node user
USER node

# Install app dependencies
RUN npm install

# Copy the rest of your code with appropriate permissions
COPY --chown=node:node . .

# Expose the port your app runs on
EXPOSE 8080

# Define the command to run your app
CMD ["npm", "start"]