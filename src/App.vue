<template>
  <HeaderLayout />
  <CategoryView />
  <FooterLayout />
</template>

<script setup>
import { ref } from 'vue'
import HeaderLayout from './layout/HeaderLayout.vue'
import FooterLayout from './layout/FooterLayout.vue'
import CategoryView from './views/CategoryView.vue'

const message = ref('Hello Vue 3')
</script>

<style scoped></style>
