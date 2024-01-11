FROM node:20-alpine

# Create app directory with node user permission
RUN mkdir -p /usr/src/app && chown -R node:node /usr/src/app

WORKDIR /usr/src/app

# Switch to the node user before running npm install
USER node

# Copy package.json and package-lock.json with the correct permissions
COPY --chown=node:node package*.json ./

# Install app dependencies
RUN npm install

# Bundle app source with the correct permissions
COPY --chown=node:node . .

# Your application's default port
EXPOSE 8080

# Start the application
CMD ["npm", "start"]