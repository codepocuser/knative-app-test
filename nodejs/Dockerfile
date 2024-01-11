FROM node:20-alpine

# Create app directory
WORKDIR /usr/src/app

# Set npm to use the cache directory within the non-root user's home
ENV NPM_CONFIG_CACHE=/usr/src/app/.npm

# Ensure the cache directory exists and has the correct permissions
RUN mkdir -p ${NPM_CONFIG_CACHE} && \
    chown -R node:node ${NPM_CONFIG_CACHE}

# Copy package.json and package-lock.json
COPY package*.json ./

# Switch to the node user before running npm install
USER node

# Install app dependencies without using cache
# Since we're using a custom cache location, we don't need to disable cache usage
RUN npm install

# Bundle app source
COPY --chown=node:node . .

# Your application's default port
EXPOSE 8080

# Start the application
CMD ["npm", "start"]