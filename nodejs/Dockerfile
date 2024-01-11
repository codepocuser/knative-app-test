FROM node:20-alpine
# Create app directory
WORKDIR /usr/src/app

# Install app dependencies
COPY package*.json ./
RUN npm install

# Bundle app source
COPY . .

# Set the npm cache directory to a folder with proper permissions
ENV NPM_CONFIG_CACHE=/usr/src/app/.npm

# Your application's default port
EXPOSE 8080

CMD [ "npm", "start" ]