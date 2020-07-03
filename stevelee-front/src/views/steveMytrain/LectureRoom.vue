<template>
    <div>
      <v-container class="grey lighten-5">
        <v-row no-gutters>
          <template>
            <v-col lg="6">
              <v-btn class="mr-4" depressed large color="primary">Primary</v-btn>
              <v-btn class="mr-4" depressed large color="error">Primary</v-btn>
              <v-btn depressed large color="primary">Primary</v-btn>
            </v-col>
            <v-col lg="6">
              <v-btn class="mr-4" depressed large color="primary">Primary</v-btn>
              <v-btn class="mr-4" depressed large color="error">Primary</v-btn>
              <v-btn depressed large color="primary">Primary</v-btn>
            </v-col>
          </template>
        </v-row>
        <v-row no-gutters>
          <v-col lg="12">
            <div class="mt-6">
              <iframe 
              width="100%"
              height="300"
              src="http://www.steveleejava.com/"
              />
            </div>
          </v-col>
        </v-row>
      </v-container>
    </div>
</template>

<script>
export default {
  name : 'lectureRoom',
}
</script>
