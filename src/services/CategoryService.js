// src/services/bookService.js
const API = 'http://localhost:8080/api/category-management'

export const getCategories = async () => {
  const res = await fetch(`${API}/playlist`)
  if (!res.ok) throw new Error('Failed to fetch books')
  return await res.json()
}

export const createCategory = async (data) => {
  const res = await fetch(`${API}/add`, {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(data),
  })
  return await res.json()
}

export const updateCategory = async (id, data) => {
  const res = await fetch(`${API}/update/${id}`, {
    method: 'PUT',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(data),
  })
  return await res.json()
}

export const deleteCategory = async (id) => {
  const res = await fetch(`${API}/delete/${id}`, {
    method: 'DELETE',
  })
  if (!res.ok) {
    const error = await res.text()
    throw new Error('Delete failed: ' + error)
  }
}

export const getCategoryById = async (id) => {
  const res = await fetch(`${API}/detail/${id}`)
  if (!res.ok) throw new Error('Failed to fetch book detail')
  return await res.json()
}
