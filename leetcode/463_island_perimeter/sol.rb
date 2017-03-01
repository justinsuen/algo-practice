def island_perimeter(grid)
  # directions
  dirs = [[0, -1], [0, 1], [1, 0], [-1, 0]]

  perim = 0

  grid.each_with_index do |row, i|
    row.each_with_index do |col, j|
      if grid[i][j] == 1
        edges = 4

        dirs.each do |dir|
          x, y = dir[0], dir[1]

          next if i + x < 0 || j + y < 0

          if grid[i + x] && grid[i + x][j + y] && grid[i + x][j + y] == 1
            edges -= 1
          end
        end

        perim += edges
      end
    end
  end

  perim
end
