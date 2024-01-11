FROM node:20-alpine

# Create app directory with node user permission
WORKDIR /usr/src/app

# Copy package.json and package-lock.json
COPY package*.json ./

# OpenShift specific: make directory writable by any user
RUN chmod -R 777 /usr/src/app

# Set the npm cache directory to a path inside the work directory
# This ensures that npm has the necessary permissions to access it
ENV NPM_CONFIG_CACHE=/usr/src/app/.npm

# Install app dependencies
# As of npm@5, the cache is self-healing from corruption issues
# RUN npm install --unsafe-perm=true --allow-root
RUN npm install

# Copy the rest of the application source code
COPY . .

# OpenShift specific: make directory writable by any user
RUN chmod -R 777 /usr/src/app

# Your application's default port
EXPOSE 8080

# Start the application
CMD ["npm", "start"]