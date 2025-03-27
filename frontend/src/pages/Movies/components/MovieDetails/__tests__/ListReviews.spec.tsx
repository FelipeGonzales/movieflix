import { render, screen } from '@testing-library/react'
import ListReviews from '../components/ListReviews'
import { movieResponseWithReview } from './fixtures'

test('should render ListReview', () => {
  render(
    <ListReviews review={ movieResponseWithReview.reviews[0] } />
  )

  expect(screen.getByTestId('star-image')).toBeInTheDocument()
  expect(screen.getByText('felipe')).toBeInTheDocument()
  expect(screen.getByText('Gostei demais desse filme!!!')).toBeInTheDocument()
})