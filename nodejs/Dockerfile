FROM node:20-alpine

# Create app directory with node user permission
WORKDIR /usr/src/app

# Copy package.json and package-lock.json
COPY package*.json ./

# Change ownership of the work directory to the node user
# This is necessary to ensure npm can write to the directory
RUN chown -R node:node /usr/src/app

# Set the npm cache directory to a path inside the work directory
# This ensures that npm has the necessary permissions to access it
ENV NPM_CONFIG_CACHE=/usr/src/app/.npm

# Switch to the node user
USER node

# Install app dependencies
RUN npm install

# Copy the rest of the application source code
COPY --chown=node:node . .

# Your application's default port
EXPOSE 8080

USER 1008830000

# Start the application
CMD ["npm", "start"]